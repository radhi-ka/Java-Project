package com.easylearnjava.extendsDemo;

public class Savings extends Account {

	//Method Overriding....Different Class,Same method,Same params, Different behaviour
	
	public double getInterestRate(){
		super.getInterestRate(); //will call parent class method
		this.getpin(); //will call current class method
		System.out.println("getInterestRate is for christmas is called..");
		System.out.println("Business logic for christmas season is called..");
		return 2.5;
	}
	public double getpin() {
		System.out.println("checking to see whether it appears in compile time, but it does not appear during complie time");
		return 11.2;
	}

}
