package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	
	public Connection getConnection() {
		
		try{
			return DriverManager.getConnection("jdbc:mysql://127.0.0.1/bdestoque","usuarioBd","teste123");
		} catch(Exception error) {
			throw new RuntimeException("erro ao conectar " + error);
		}
		
		
	}

}
