package com.xworkz.libraryapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString
public class Monitor {

	
	public  Monitor() {
		
		System.out.println(this.getClass().getSimpleName()+"objecte is created");
	}
	
	@Value("123")
	private int id; 
	@Value("Dell")
    private String	monitorBrand;
	@Value("Rectangular")
	 private String type;
	@Value("2023")
	 private String yearOfLonch;
	@Value("2000")
	 private String price;
}
