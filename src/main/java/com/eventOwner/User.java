package com.eventOwner;

public class User {
	private int userId;
	private String userName;
	private String password;
	private String  role;
	private String address;
	private String city;
	
	public User(int userId,String userName,String password,String role,String address,String city) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.role = role;
		this.address = address;
		this.city = city;
		
		
	}

	public int getUserId() {
		return userId;
	}

	

	public String getUserName() {
		return userName;
	}

	

	public String getPassword() {
		return password;
	}

	

	public String getRole() {
		return role;
	}

	

	public String getAddress() {
		return address;
	}

	

	public String getCity() {
		return city;
	}

	

}
