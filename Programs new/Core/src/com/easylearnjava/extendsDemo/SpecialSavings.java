package com.easylearnjava.extendsDemo;

public class SpecialSavings extends Savings {

	public void m3() {
	super.getInterestRate()	; //this will call method from savings as it is the immediate class
	super.getAccountBalance("qqq"); //this will call the method from account as it is the immediate class. 
	// So, basically it will search for the immediate availability. so if the super is not having that method it will go to the super super class to get that method
	
	}
}
