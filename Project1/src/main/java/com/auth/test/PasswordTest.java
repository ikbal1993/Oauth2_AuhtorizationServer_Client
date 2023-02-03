package com.auth.test;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordTest {

	public static void main(String[] args) {
		PasswordEncoder pass = new BCryptPasswordEncoder();
		System.out.println(pass.encode("1234"));
	}
}
