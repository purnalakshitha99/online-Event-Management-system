package com.eventOwner;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DButilUser {
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean RegistrationUser(String username,String password,String role,String address,String city,String fullName ) {
		boolean isSuccess = false;
		try {
			
			con = DBConnectionEvent.getConnection();
			stmt = con.createStatement();
			String sql = "insert into `user` values(0,'"+username+"','"+password+"','"+role+"','"+address+"','"+city+"','"+fullName+"')";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				
				
				isSuccess = true;
				
				System.out.println(isSuccess);
			}
			else 
			{
			isSuccess = false;

		}
			
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		return isSuccess;
	}
	
	public static boolean validate(String username,String password) {
		
		
		try {
			con = DBConnectionEvent.getConnection();
			stmt = con.createStatement();
			String sql = "select * from user where userName ='"+username+"' and password ='"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
			
			}catch(Exception e) {
				e.printStackTrace();
			}
		return  isSuccess;
	}
}
	
