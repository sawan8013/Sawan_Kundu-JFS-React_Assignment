package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping("/")
	public String home() {
		return "<h1>Hello World</h1>";
	}
	@GetMapping("/user")
	public String user() {
		return "<h1>Welcome User </h1>";
	}
	@GetMapping("/employee")
	public String admin() {
		return "<h1>Welcome Admin</h1>";
	}
}
