package com.test.connect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


@Entity
@Table(name = "USERS")
public class User {
	
	@Column(name = "USER_ID")
	@Id
	private int id;
	
	@Column(name = "FIRST_NAME")
	@Size(min=6, message = "{username.size}")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	private String lastName;
	
	@Email(message = "{email.validation.valid}")
	@Column(name = "EMAIL")
	private String email;
	
	@Size(min=8, message = "{password.validation.size}")
	@Pattern(regexp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}", message = "{password.validation.valid}")
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "USERNAME")
	private String username;
	
	@Column(name = "USER_TYPE")
	private String userType;

	public User(int id, String firstName, String lastName, String email, String password, String username,
			String userType) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.username = username;
		this.userType = userType;
	}
	
	public User() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}
	
	
	
	
}
