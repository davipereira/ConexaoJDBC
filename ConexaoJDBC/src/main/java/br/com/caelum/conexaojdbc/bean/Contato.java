package br.com.caelum.conexaojdbc.bean;

import java.util.Calendar; 
 
/**
 * @author Davi Pereira
 * @version 1.0
 * @category JavaBean Contato
 */
public class Contato {
  
	private Long id;
	private String nome; 
	private String email;
	private String endereco; 
	private Calendar dataNascimento;
  
	  /**
	  * @return the email
	  */
	  public String getEmail() {
		  return email;
	  }
	  
	  /**
	  * @param email the email to set
	  */
	  public void setEmail(String email){
		   this.email = email;
	  }
	   
	   /**
		  * @param id the id to set
		  */
	  public void setId(Long id){
		   this.id = id;
	  }
	  
	  /**
	   * @return the id
	   */
	  public Long getId() {
		  return id;
	  }

	/**
	  * @return the endereco
	  */
	  public String getEndereco() {
		  return endereco;
	  }
	
	  /**
	  * @param endereco the endereco to set
	  */ 
	  public void setEndereco(String endereco){
		  this.endereco = endereco;
	  }
	
	  /**
	  * @return the nome
	  */
	  public String getNome() {
		  return nome;
	  }
	 
	  /**
	  * @param nome the nome to set
	  */
	  public void setNome(String nome) {
		  this.nome = nome;
	  }
	  
	  /**
	  * @return the dataNascimento
	  */  
	  public Calendar getDataNascimento() {
		  return this.dataNascimento;
	  }
	    
	  /**
	  * @param dataNascimento the dataNascimento to set
	  */
	  public void setDataNascimento(Calendar dataNascimento) {
		  this.dataNascimento = dataNascimento;
	  }
}















