package com.xworkz.libraryapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@ToString
@Component

public class Systemm {

	@Autowired
	private List<Monitor> monitor;
}
