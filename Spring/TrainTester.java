package com.xworkz.train.app;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TrainTester {
	


public static void main(String[] args) {
	
	ApplicationContext applicationContext=new AnnotationConfigApplicationContext(TrainConfigration.class);
	
	
	Laptop laptop=applicationContext.getBean("lap" ,Laptop.class);
	System.out.println(laptop);
	
	Laptop laptop1=applicationContext.getBean("laptop1" ,Laptop.class);
	System.out.println(laptop1);
	
	Laptop laptop2=applicationContext.getBean("laptop2" ,Laptop.class);
	System.out.println(laptop2);
	
	Laptop laptop3=applicationContext.getBean("laptop3" ,Laptop.class);
	System.out.println(laptop3);
	
	Laptop laptop4=applicationContext.getBean("laptop4" ,Laptop.class);
	System.out.println(laptop4);
	
	Laptop laptop5=applicationContext.getBean("laptop5" ,Laptop.class);
	System.out.println(laptop5);
	
	
	
	
	
	Wire wire =applicationContext.getBean("wir",Wire.class);
	System.out.println(wire);
	
	

	Wire wire2 =applicationContext.getBean("wire2",Wire.class);
	System.out.println(wire2);
	
	Wire wire3 =applicationContext.getBean("wire3",Wire.class);
	System.out.println(wire3);
	
	Wire wire4 =applicationContext.getBean("wire4",Wire.class);
	System.out.println(wire4);
	
	Wire wire5 =applicationContext.getBean("wire5",Wire.class);
	System.out.println(wire5);
	
	
	
	
	
	 MantriMall mantriMall1= applicationContext.getBean("MantriMall1",MantriMall.class);
	System.out.println(mantriMall1);
	
	MantriMall mantriMall2= applicationContext.getBean("MantriMall2",MantriMall.class);
	System.out.println(mantriMall2);
	
	MantriMall mantriMall3= applicationContext.getBean("MantriMall3",MantriMall.class);
	System.out.println(mantriMall3);
	
	MantriMall mantriMall4= applicationContext.getBean("MantriMall4",MantriMall.class);
	System.out.println(mantriMall4);
	
	MantriMall mantriMall5= applicationContext.getBean("MantriMall5",MantriMall.class);
	System.out.println(mantriMall5);
	
	
	
	
	FoodStall foodStall=applicationContext.getBean("foo",FoodStall.class);
	System.out.println(foodStall);
	
		
	FoodStall foodStall1=applicationContext.getBean("FoodStall1",FoodStall.class);
	System.out.println(foodStall1);
	
	FoodStall foodStall2=applicationContext.getBean("FoodStall2",FoodStall.class);
	System.out.println(foodStall2);
	
	FoodStall foodStall3=applicationContext.getBean("FoodStall3",FoodStall.class);
	System.out.println(foodStall3);
	
	FoodStall foodStall4=applicationContext.getBean("FoodStall4",FoodStall.class);
	System.out.println(foodStall4);
	
	FoodStall foodStall5=applicationContext.getBean("FoodStall5",FoodStall.class);
	System.out.println(foodStall5);
	
	
	
	
	
	
	
	
	

	Train train=applicationContext.getBean("tra",Train.class);
	System.out.println(train);
	
	Train train1=applicationContext.getBean("train1",Train.class);
	System.out.println(train1);
	
	Train train2=applicationContext.getBean("train2",Train.class);
	System.out.println(train2);
	
	Train train3=applicationContext.getBean("train3",Train.class);
	System.out.println(train3);
	
	Train train4=applicationContext.getBean("train4",Train.class);
	System.out.println(train4);
	
	Train train5=applicationContext.getBean("train5",Train.class);
	System.out.println(train5);
	
	
	Integer integer=applicationContext.getBean("int",Integer.class);
	System.out.println(integer);
	
	Integer integer1=applicationContext.getBean("int1",Integer.class);
	System.out.println(integer1);
	
	Integer integer2=applicationContext.getBean("int2",Integer.class);
	System.out.println(integer2);
	
	Integer integer3=applicationContext.getBean("int3",Integer.class);
	System.out.println(integer3);
	
	Integer integer4=applicationContext.getBean("int4",Integer.class);
	System.out.println(integer4);
	
	Integer integer5=applicationContext.getBean("int5",Integer.class);
	System.out.println(integer5);
	
	
	
	
	
	String string=applicationContext.getBean("String",String.class);
	System.out.println(string);
	
	String string1=applicationContext.getBean("String1",String.class);
	System.out.println(string1);
	
	String string2=applicationContext.getBean("String2",String.class);
	System.out.println(string2);
	
	String string3=applicationContext.getBean("String3",String.class);
	System.out.println(string3);
	
	String string4=applicationContext.getBean("String4",String.class);
	System.out.println(string4);
	
	String string5=applicationContext.getBean("String5",String.class);
	System.out.println(string5);
	
	
	Character character=applicationContext.getBean("character",Character.class);
	System.out.println(character);
	
	
	Character character1=applicationContext.getBean("character1",Character.class);
	System.out.println(character1);
	
	Character character2=applicationContext.getBean("character2",Character.class);
	System.out.println(character2);
	
	Character character3=applicationContext.getBean("character3",Character.class);
	System.out.println(character3);
	
	Character character4=applicationContext.getBean("character4",Character.class);
	System.out.println(character4);
	
	Character character5=applicationContext.getBean("character5",Character.class);
	System.out.println(character5);
	
	
	Byte bb1=applicationContext.getBean("byt1",Byte.class);
	System.out.println(bb1);
	
	Byte bb2=applicationContext.getBean("byt2",Byte.class);
	System.out.println(bb2);
	
	Byte bb3=applicationContext.getBean("byt3",Byte.class);
	System.out.println(bb3);
	
	Byte bb4=applicationContext.getBean("byt4",Byte.class);
	System.out.println(bb4);
	
	Byte bb5=applicationContext.getBean("byt5",Byte.class);
	System.out.println(bb5);
	
	
	
	Boolean boo=applicationContext.getBean("boln1",Boolean.class);
	System.out.println(boo);
	
	
	Boolean boo1=applicationContext.getBean("boln2",Boolean.class);
	System.out.println(boo1);
	
	
	Double bubl1=applicationContext.getBean("dble1",Double.class);
	System.out.println(bubl1);
	
	Double bubl2=applicationContext.getBean("dble2",Double.class);
	System.out.println(bubl2);
	
	Double sh=applicationContext.getBean("shrt1",Double.class);
	System.out.println(sh);
	
	Double flo1=applicationContext.getBean("flt1",Double.class);
	System.out.println(flo1);
	
	Double ln=applicationContext.getBean("lng1",Double.class);
	System.out.println(ln);
	
	
}
}
//new Scanner()