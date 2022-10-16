package dao;

import java.sql.Connection;
import java.sql.DriverManager;

import oracle.jdbc.driver.OracleDriver;

public class DataSource {
	
	private Connection connection;
	
	private String url;
	private String hostName;
	private String usuario;
	private String senha;
	private int porta;
	private String banco;
	
	public DataSource() {
		try {
			
			hostName = "oracle.fiap.com.br";
			porta = 1521;
			usuario = "pf0709";
			senha = "fiap22";
			banco = "orcl";
			
			url = "jdbc:oracle:thin:@"+hostName+":"+porta+":"+banco;
			
			DriverManager.registerDriver(new OracleDriver());
			
			connection = DriverManager.getConnection(url,usuario,senha);
			if(connection != null) {
				System.out.println("Conectado ao Oracle com sucesso !!!");
			} else {
				System.out.println("Erro ao conectar com o Oracle");
			}
			
			
		}
		catch(Exception ex) {
			System.out.println("Erro ao conectar com o SGBD. Erro: " + ex.getMessage());
		}
		
	}
	

	public Connection getConnection() {
		return connection;
	}

}
