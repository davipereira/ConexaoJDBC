package br.com.caelum.conexaojdbc.jdbc.teste;

import java.util.Calendar;
import java.util.List;

import br.com.caelum.conexaojdbc.bean.Contato;
import br.com.caelum.conexaojdbc.jdbc.dao.ContatoDAO;

/**
 * @author Davi Pereira
 * @version 1.0
 * @category Teste de ContatoDAO
 */
public class TesteContatoDAO {

	public static void main (String args []) {
		
		// Inserção...
	    Contato contato = new Contato();	    
	    contato.setNome("Davi Pereira");
	    contato.setEmail("davi.pereira@outlook.com");
	    contato.setEndereco("Rua rio doce nº 307, Ipsep, Recife - PE");
	    contato.setDataNascimento(Calendar.getInstance());
	    
	    ContatoDAO contatoDAO = new ContatoDAO();	    
	    contatoDAO.adicionar(contato);
	    
	    System.out.println("Contato salvo com sucesso.");
	    
	    // Consulta
	    List<Contato> listaContato = contatoDAO.consultar();
	    System.out.println("Resultado da Consulta.:");
	    for(Contato contatoConsulta: listaContato){	    	
	    	System.out.println("Nome: " + contatoConsulta.getNome() + ", E-mail: " + contatoConsulta.getEmail() + ", Endereço: " + 
	    	contatoConsulta.getEndereco() + ", Data de Nascimento:" + contatoConsulta.getDataNascimento().getTime());
	    }
	}	
}
