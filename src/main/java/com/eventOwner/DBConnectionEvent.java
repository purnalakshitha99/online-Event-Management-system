package com.eventOwner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionEvent {

	public static Connection getConnection() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/onlineeventmanagementsystem2";
		String username = "root";
		String password = "purna123";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection(url,username,password);
			
			
		}catch (Exception e) {
			System.out.println("connection not successfull");
		
		}
		
		return con;
	}

}
