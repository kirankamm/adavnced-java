package com.xworkz.train.app;

import org.springframework.context.annotation.Configuration;

import lombok.Data;
import lombok.ToString;

@Configuration
@Data
@ToString
public class Train {

	private int id;
	private String trainName;
	private String passengerName;
}
