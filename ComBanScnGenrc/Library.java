package com.xworkz.libraryapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@ToString


public class Library {

	@Autowired
	private List<Book> book;
	
}
