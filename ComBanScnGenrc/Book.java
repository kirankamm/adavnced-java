package com.xworkz.libraryapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;


@ToString
@Component
public class Book {

	public  Book() {
		
		System.out.println(this.getClass().getSimpleName()+"objecte is created");
	}
	
	@Value("1")
	private int id; 
	@Value("Kiran")
    private String	authore;
	@Value("BloodNight")
	 private String bookName;
	@Value("2023")
	 private String yearOfPublication;
	@Value("200")
	 private String price;
	
}
