package com.xworkz.train.app;

import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Configuration
public class Scanner {

	private String shopName;
	private String ownerName;
	private int salary;
}
