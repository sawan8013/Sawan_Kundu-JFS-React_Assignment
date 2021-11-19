package com.customer;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Customer {
	@NotNull(message = "Name may not be null")
	@NotEmpty(message = "Name is Required")
	@Size(min=8,max=20)
	String username;
	
	@NotNull(message ="Password may not be null")
	@NotEmpty(message = "Password is Required")
	String password;
	
	@NotNull 
	@NotEmpty
	@Email
	String email;
	
	
	String contact;
	
	
	String city;
	
	@NotNull 
	@NotEmpty
	@Min(6)
	int zipcode;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipcode() {
		return zipcode;
	}
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
}
