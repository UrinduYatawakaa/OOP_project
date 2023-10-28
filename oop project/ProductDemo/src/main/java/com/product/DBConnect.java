package com.product;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static String url = "jdbc:mysql://localhost:3306/product";
	private static String user = "root";
	private static String password = "1234";
	private static Connection con;
	
	public static Connection getConnction() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			System.out.println("Database connection failed!");
		}
		
		return con;
		
	}

}
