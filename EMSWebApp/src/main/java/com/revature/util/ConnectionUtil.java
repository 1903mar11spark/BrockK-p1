package com.revature.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {

	// * * * do not ever hardcode credentials  * * *
	
	public static Connection getConnection() throws SQLException {
		String url = "jdbc:oracle:thin:@spark-1903mar11.c7dlwsqupbdr.us-east-2.rds.amazonaws.com:1521:orcl";
		String username = "admin";
		String pass = "Higgins75";
		try {
			   Class.forName("oracle.jdbc.driver.OracleDriver");
			}
			catch(ClassNotFoundException ex) {
			   System.out.println("Error: unable to load driver class!");
			}
		return DriverManager.getConnection(url, username, pass);
	}

	public static Connection getConnectionFromFile2() throws SQLException, IOException {
		//Properties prop = new Properties();
		//InputStream in = ConnectionUtil.class.getClassLoader().getResourceAsStream("connection.properties");
		//prop.load(in);
		
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		Properties prop = new Properties();
		try(InputStream resourceStream = loader.getResourceAsStream("src/main/resources/connection.properties")) {
		    prop.load(resourceStream);
		}
		
		try {
			   Class.forName("oracle.jdbc.driver.OracleDriver");
			}
			catch(ClassNotFoundException ex) {
			   System.out.println("Error: unable to load driver class!");
			}
		return DriverManager.getConnection(prop.getProperty("url"), prop.getProperty("username"),
				prop.getProperty("pass"));
	}

}