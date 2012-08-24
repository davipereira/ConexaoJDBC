package br.com.caelum.conexaojdbc.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.conexaojdbc.bean.Contato;
import br.com.caelum.conexaojdbc.jdbc.ConnectionFactory;
 
/**
 * @author Davi Pereira
 * @version 1.0
 * @category DAO de Contato
 */
public class ContatoDAO { 
  
	private Connection con;
  
	// Constructor
	public ContatoDAO() {
		this.con = new ConnectionFactory().getConnection();
	}
  
	/**
	 * Insere um contato no banco de dados.
	 * @param contato
	 */
	public void adicionar(Contato contato) {
		String sql = "INSERT INTO contatos (nome, email, endereco, dataNascimento) VALUES (?, ?, ?, ?)";
    
		try {
			// prepared statement para inserção
			PreparedStatement stmt = con.prepareStatement(sql);
	     
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));
	      
			stmt.execute();
			stmt.close();
		} catch (SQLException e){
			throw new RuntimeException(e);
		} 
	}
	
	public List<Contato> consultar() {
		List<Contato> listaContato = new ArrayList<Contato>();
		
		PreparedStatement stmt;
		try {
			stmt = this.con.prepareStatement("SELECT * FROM contatos");
			
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				// criando o objeto Contato
				Contato contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));
				
				// montando a data através do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);
				
				// adicionando o objeto à lista
				listaContato.add(contato);
			}
			
			// Fechando o resultset e o caminho da conexão.
			rs.close();
			stmt.close();			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
		
		return listaContato;	
	}	
}