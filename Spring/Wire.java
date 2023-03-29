package com.xworkz.train.app;

import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.ToString;

@Data
@Configuration
@ToString
public class Wire {

	private String wireName;
	private String ownerName;
	private int price;
	
	
}
