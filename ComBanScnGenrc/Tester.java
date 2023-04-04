package com.xworkz.libraryapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Tester {

	public static void main(String[] args) {
	
		
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		Library library=applicationContext.getBean(Library.class);
	    System.out.println(library);
	    
	    
	    Systemm systemm=applicationContext.getBean(Systemm.class);
	    System.out.println(systemm);
	}
	
	
}
