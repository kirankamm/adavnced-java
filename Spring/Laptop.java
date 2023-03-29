package com.xworkz.train.app;

import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.ToString;
@ToString
@Data
@Configuration
public class Laptop {

	private int id;
	private String shopName;
	private String ownerName;

	
}
