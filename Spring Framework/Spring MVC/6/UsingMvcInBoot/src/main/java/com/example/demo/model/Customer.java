package com.example.demo.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;


public class Customer {
	
	@NotNull(message= "Name may not be null")
	@NotEmpty(message= "Name may not be Empty")
	@Size(min=8, max=20, message="user name must be between 8 to 20")
	String username;
	
	
	String password;
	
	@NotEmpty(message= "email may not be null")
	@NotBlank(message= "email may not be blank")
	@Email
	String email;
	
	Long contact;
	
	@NotEmpty
	String city;
	
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
	public Long getContact() {
		return contact;
	}
	public void setContact(Long contact) {
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
