package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiClass {

	//localhost:8080/api/home
	
	@GetMapping("/api/home")
	public String method() {
		return "Welcome to Oauth2 Session";
	}
}
