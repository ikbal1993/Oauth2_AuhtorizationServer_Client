package com.demo.server;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class MyConfigSecurity {

	@Bean
	SecurityFilterChain chain(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated()
		.and()
		.formLogin(Customizer.withDefaults());
		return http.build();
	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Bean
	UserDetailsService userDetails() {
		UserDetails user = User.builder().username("user").password("1234").roles("USER").build();
		return new InMemoryUserDetailsManager(user);
	}
}
