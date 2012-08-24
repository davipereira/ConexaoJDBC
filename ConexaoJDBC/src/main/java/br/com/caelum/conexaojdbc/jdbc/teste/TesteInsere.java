package br.com.caelum.conexaojdbc.jdbc.teste;

import java.util.Calendar;
import br.com.caelum.conexaojdbc.bean.Contato;
import br.com.caelum.conexaojdbc.jdbc.dao.ContatoDAO;

/**
 * @author Davi Pereira
 * @version 1.0
 * @category Teste de Inserção
 */
public class TesteInsere {

	public static void main (String args []) {
	    Contato contato = new Contato();
	    
	    contato.setNome("Davi Pereira");
	    contato.setEmail("davi.pereira@outlook.com");
	    contato.setEndereco("Rua rio doce nº 307, Ipsep, Recife - PE");
	    contato.setDataNascimento(Calendar.getInstance());
	    
	    ContatoDAO contatoDAO = new ContatoDAO();
	    
	    contatoDAO.adicionar(contato);
	    System.out.println("Contato salvo com sucesso.");
	  }	
}
