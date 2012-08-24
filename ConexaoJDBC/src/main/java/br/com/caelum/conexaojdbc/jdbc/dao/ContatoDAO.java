package br.com.caelum.conexaojdbc.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;

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
}