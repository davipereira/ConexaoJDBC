package br.com.caelum.conexaojdbc.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Davi Pereira
 * @version 1.0
 * @category Conexão com banco de dados.
 */
public class ConnectionFactory {
   
	/**
	 * @return connection
	 */ 
	public Connection getConnection() {
		try {
			// Class.forName("com.mysql.jdbc.Driver"); // A partir do Java 6 não é mais necessário.
			return DriverManager.getConnection("jdbc:mysql://s156.eatj.com:3307/davipereira", "davipereira", "fsbo120404");
		} catch (SQLException e) { 
			throw new RuntimeException(e);
		}
	}  
}