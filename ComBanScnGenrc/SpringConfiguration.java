package com.xworkz.libraryapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.xworkz.libraryapp")
public class SpringConfiguration {

	@Bean
	public Library library() {
	
		return new Library();
	}
	
	@Bean
	public Systemm systemm() {
	
		return new Systemm();
	}
}
