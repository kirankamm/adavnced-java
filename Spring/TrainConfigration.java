package com.xworkz.train.app;

import java.util.Scanner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class TrainConfigration {
	
	@Bean(name="tra")
public Train getTrain() {
	Train train=new Train();
	train.setId(1);
	train.setTrainName("channamma");
	train.setPassengerName("virat");
	
	
	return train;
}
	

	@Bean(name="train1")
	public Train getTrain1() { 
	Train train1=new Train();

	train1.setId(2);
	train1.setTrainName("Nizamuddin");
	train1.setPassengerName("Anushka");

	return train1;
	}

	
	@Bean(name="train2")
	public Train getTrain2() { 
	Train train1=new Train();

	train1.setId(4);
	train1.setTrainName("muddin");
	train1.setPassengerName("Anu");

	return train1;
	}
	
	
	@Bean(name="train3")
	public Train getTrain3() { 
	Train train1=new Train();

	train1.setId(4);
	train1.setTrainName("dadar");
	train1.setPassengerName("kalki");

	return train1;
	}
	
	
	@Bean(name="train4")
	public Train getTrain4() { 
	Train train1=new Train();

	train1.setId(5);
	train1.setTrainName("rayanna");
	train1.setPassengerName("vani");

	return train1;
	}
	
	
	@Bean(name="train5")
	public Train getTrain5() { 
	Train train1=new Train();

	train1.setId(8);
	train1.setTrainName("gandi");
	train1.setPassengerName("puthali");

	return train1;
	}
	
	
	
	
	
	
	
	
	
	
	
@Bean(name = "lap")	
public Laptop getLaptop() {
	Laptop laptop=new Laptop();
	laptop.setId(123);
	laptop.setShopName("benglure");
	laptop.setOwnerName("nagu");
	return laptop;
}

@Bean(name="laptop1")	
public Laptop getLaptop1() {
	Laptop laptop=new Laptop();
	laptop.setId(456);
	laptop.setShopName("vani");
	laptop.setOwnerName("vilas");
	return laptop;
}

@Bean(name="laptop2")	
public Laptop getLaptop2() {
	Laptop laptop=new Laptop();
	laptop.setId(98);
	laptop.setShopName("raguveer");
	laptop.setOwnerName("sanam");
	return laptop;
}

@Bean(name="laptop3")	
public Laptop getLaptop3() {
	Laptop laptop=new Laptop();
	laptop.setId(645);
	laptop.setShopName("janaki");
	laptop.setOwnerName("jeevan");
	return laptop;
}

@Bean(name="laptop4")	
public Laptop getLaptop4() {
	Laptop laptop=new Laptop();
	laptop.setId(45);
	laptop.setShopName("prema");
	laptop.setOwnerName("yallu");
	return laptop;
}

@Bean(name="laptop5")	
public Laptop getLaptop5() {
	Laptop laptop=new Laptop();
	laptop.setId(56);
	laptop.setShopName("deraj");
	laptop.setOwnerName("janvi");
	return laptop;
}
@Bean(name="wir")
public Wire getWire() {
	
	Wire wire=new Wire();
	wire.setWireName("ravi");
	wire.setOwnerName("mallu");
	wire.setPrice(1030);
	return  wire;
}






@Bean(name="wire2")
public Wire getWire2() {
	
	Wire wire=new Wire();
	wire.setWireName("GM");
	wire.setOwnerName("sagar");
	wire.setPrice(10345);
	return  wire;
	
}

@Bean(name="wire3")
public Wire getWire3() {
	
	Wire wire=new Wire();
	wire.setWireName("brite");
	wire.setOwnerName("veer");
	wire.setPrice(1600);
	return  wire;
	
}

@Bean(name="wire4")
public Wire getWire4() {
	
	Wire wire=new Wire();
	wire.setWireName("anu");
	wire.setOwnerName("sagar");
	wire.setPrice(18900);
	return  wire;
	
}


@Bean(name="wire5")
public Wire getWire5() {
	
	Wire wire=new Wire();
	wire.setWireName("gagan");
	wire.setOwnerName("sangu");
	wire.setPrice(1080);
	return  wire;
	
}

@Bean(name="man")
public MantriMall getMantriMall() {
	MantriMall mantriMall=new MantriMall();
	
	mantriMall.setId(190);
	mantriMall.setShopName("karan");
	mantriMall.setOwnerName("harini");
	
	return mantriMall;
}

@Bean(name="MantriMall1")
public MantriMall getMantriMall1() {
	MantriMall mantriMall=new MantriMall();
	
	mantriMall.setId(145);
	mantriMall.setShopName("navven");
	mantriMall.setOwnerName("deeraj");
	
	return mantriMall;
}

@Bean(name="MantriMall2")
public MantriMall getMantriMall2() {
	MantriMall mantriMall=new MantriMall();
	
	mantriMall.setId(145);
	mantriMall.setShopName("nagya");
	mantriMall.setOwnerName("jananisya");
	
	return mantriMall;
}

@Bean(name="MantriMall3")
public MantriMall getMantriMall3() {
	MantriMall mantriMall=new MantriMall();
	
	mantriMall.setId(198);
	mantriMall.setShopName("quen");
	mantriMall.setOwnerName("feena");
	
	return mantriMall;
}

@Bean(name="MantriMall4")
public MantriMall getMantriMall4() {
	MantriMall mantriMall=new MantriMall();
	
	mantriMall.setId(1890);
	mantriMall.setShopName("manju");
	mantriMall.setOwnerName("sanju");
	
	return mantriMall;
}

@Bean(name="MantriMall5")
public MantriMall getMantriMall5() {
	MantriMall mantriMall=new MantriMall();
	
	mantriMall.setId(345);
	mantriMall.setShopName("hani");
	mantriMall.setOwnerName("manu");
	
	return mantriMall;
}

@Bean(name="foo")	
public FoodStall getFoodStall() {
	FoodStall foodStall=new FoodStall();
	
	foodStall.setShopName("madya");
	foodStall.setOwnerName("king");
	foodStall.setSalary(1780);
	
	return foodStall;
}


@Bean(name="FoodStall1")	
public FoodStall getFoodStall1() {
	FoodStall foodStall=new FoodStall();
	
	foodStall.setShopName("lala");
	foodStall.setOwnerName("parvati");
	foodStall.setSalary(10460);
	
	return foodStall;
}

@Bean(name="FoodStall2")	
public FoodStall getFoodStall2() {
	FoodStall foodStall=new FoodStall();
	
	foodStall.setShopName("rani");
	foodStall.setOwnerName("raja");
	foodStall.setSalary(1340);
	
	return foodStall;
}

@Bean(name="FoodStall3")	
public FoodStall getFoodStall3() {
	FoodStall foodStall=new FoodStall();
	
	foodStall.setShopName("shanmuka");
	foodStall.setOwnerName("kartik");
	foodStall.setSalary(1900);
	
	return foodStall;
}

@Bean(name="FoodStall4")	
public FoodStall getFoodStall4() {
	FoodStall foodStall=new FoodStall();
	
	foodStall.setShopName("vinayaka");
	foodStall.setOwnerName("gaja");
	foodStall.setSalary(2340);
	
	return foodStall;
}

@Bean(name="FoodStall5")	
public FoodStall getFoodStall5() {
	FoodStall foodStall=new FoodStall();
	
	foodStall.setShopName("lalit");
	foodStall.setOwnerName("fana");
	foodStall.setSalary(9876);
	
	return foodStall;
}










//int char float


@Bean (name="int")
public Integer getInt() {
	
	return 100;
}


@Bean (name="int1")
public Integer getInt1() {
	
	return 200;
}

@Bean (name="int2")
public Integer getInt2() {
	
	return 300;
}

@Bean (name="int3")
public Integer getInt3() {
	
	return 400;
}

@Bean (name="int4")
public Integer getInt4() {
	
	return 500;
}

@Bean (name="int5")
public Integer getInt5() {
	
	return 600;
}


@Bean (name="String")
public String getStringg() {
	
	return "kiran";
}

@Bean (name="String1")
public String getStringg1() {
	
	return "kammar";
}

@Bean (name="String2")
public String getStringg2() {
	
	return "kammar";
}

@Bean (name="String3")
public String getStringg3() {
	
	return "shivanand";
}


@Bean (name="String4")
public String getStringg4() {
	
	return "rajashwari";
}

@Bean (name="String5")
public String getStringg5() {
	
	return "somu";
}




@Bean (name="character")
public Character getCharacter() {
	
	return 'k';
}

@Bean (name="character1")
public Character getCharacter1() {
	
	return 'i';
}

@Bean (name="character2")
public Character getCharacter2() {
	
	return 'r';
}

@Bean (name="character3")
public Character getCharacter3() {
	
	return 'a';
}

@Bean (name="character4")
public Character getCharacter4() {
	
	return 'n';
}

@Bean (name="character5")
public Character getCharacter5() {
	
	return 's';
}


@Bean (name="byt1")
public Byte getByte1() {
	
	return 100;
}

@Bean (name="byt2")
public Byte getByte2() {
	
	return 90;
}

@Bean (name="byt3")
public Byte getByte3() {
	
	return 91;
}

@Bean (name="byt4")
public Byte getByte4() {
	
	return 102;
}

@Bean (name="byt5")
public Byte getByte5() {
	
	return 111;
}


@Bean (name="boln1")
public Boolean getBoolean1() {
	
	return true;
}

@Bean (name="boln2")
public Boolean getBoolean2() {
	
	return false;
}


@Bean (name="dble1")
public Double getDouble() {
	
	return 100.00;
}


@Bean (name="dble2")
public Double getDouble2() {
	
	return 1000000000000.9999999999999900;
}


@Bean (name="flt1")
public Float getFloat() {
	
	return 10f;
}


@Bean (name="shrt1")
public Short getShort() {
	
	return 10;
}

@Bean (name="lng1")
public Long getLong() {
	
	return 10000077777777777l;
}
















}






