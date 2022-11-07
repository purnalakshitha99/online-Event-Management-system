package com.eventOwner;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.eventOwner.DBConnectionEvent;

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
	
	public static boolean insertEvent(String eventname,String date,String venue,int numberOfGuest,String handler) {
		boolean isSuccess = false;
		
		try {
			con = DBConnectionEvent.getConnection();
			stmt = con.createStatement();
			String sql = "insert into event values(0,'"+eventname+"','"+date+"','"+venue+"','"+numberOfGuest+"','"+handler+"')";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
					
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}

	
	public static List<EventDetailsClass> getEvent() {
		 ArrayList<EventDetailsClass> event = new ArrayList<>();
		 
		 try {
			 con = DBConnectionEvent.getConnection();
			 stmt = con.createStatement();
			 String sql = "select * from event";
			 
			 rs = stmt.executeQuery(sql);
			 
			 while(rs.next()) {
				 int id = rs.getInt(1);
				 String name = rs.getString(2);
				 String  date = rs.getString(3);
				 String venue = rs.getString(4);
				 int numberOfGuest = rs.getInt(5);
				 String Handler = rs.getString(6);
			
				 EventDetailsClass c = new EventDetailsClass(id,name,date,venue,numberOfGuest,Handler);
				 event.add(c);	
				 
				 
			 }
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 
		 
		 
		return event;
	}
	
public static boolean updateEvent(String id,String name,String date,String venue,String guest,String handler) {
		int guests = Integer.parseInt(guest);
		try {
			con = DBConnectionEvent.getConnection();
			stmt = con.createStatement();
			String sql = "update `event` set eventName = '"+name+"',date ='"+date+"',Venue ='"+venue+"',numberOfGuest ='"+guests+"',handler = '"+handler+"'where eventId ='"+id+"'";
			
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		return isSuccess;
	}
	
public static List<EventDetailsClass> getEvent(String Id) {
	
	
	 ArrayList<EventDetailsClass> event = new ArrayList<>();
//	 int converdID = Integer.parseInt("Id");
	 try {
		 con = DBConnectionEvent.getConnection();
		 stmt = con.createStatement();
		 String sql = "select * from event where eventId = '"+Id+"'";
		 
		 rs = stmt.executeQuery(sql);
		 
		 while(rs.next()) {
			 int id = rs.getInt(1);
			 String name = rs.getString(2);
			 String  date = rs.getString(3);
			 String venue = rs.getString(4);
			 int numberOfGuest = rs.getInt(5);
			 String Handler = rs.getString(6);
		
			 EventDetailsClass c = new EventDetailsClass(id,name,date,venue,numberOfGuest,Handler);
			 event.add(c);	
			 
			 
		 }
		 
	 }catch(Exception e) {
		 e.printStackTrace();
	 }
	 
	 
	 
	return event;
}
	
	public static boolean deleteEvent(String id) {
		int convID = Integer.parseInt(id);
		
		try {
			con = DBConnectionEvent.getConnection();
			stmt = con.createStatement();
			String sql = "delete from event where eventId ='"+convID+"'";
			
			int rs = stmt.executeUpdate(sql); 
			
			if(rs>0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return isSuccess;
	}
	
	
}
	
