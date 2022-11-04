package com.test.connect.lib;

public enum UserType {
	USER("user"), AUTHOR("author");
	
	private String userType; 
	
	UserType(String userType) {
		this.userType = userType;
	}
	public String getUserType() {
		return userType;
	}	
	
}
