package br.com.agenda.factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	private static final String USERNAME = "root";
	
	private static final String PASSWORD = "182050";
	
	private static final String DATABASE_URL = "jdbc:mysql://localhost/agenda";
	
	
	public static Connection createConnectionToMySQL() throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
	    Connection con = createConnectionToMySQL();
	    
	    if( con != null) {
	    	System.out.println("conex�o ativa");
	    	con.close();
	    }
	    
	}

}
