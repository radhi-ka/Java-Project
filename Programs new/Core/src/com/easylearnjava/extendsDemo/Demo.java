package com.easylearnjava.extendsDemo;

public class Demo {
	public static void main(String args[]) {
		
	//acc is a reference variable of type account
    //acc is pointing to account object in the memory
	Account acc=new Account();
	acc.getAccountBalance("123");
	acc.getInterestRate();
	System.out.println();
	
	////sAcc is a reference variable of type savings
    //sAcc is pointing to savings object in the memory
	Savings sAcc=new Savings();
	//sAcc.getAccountBalance("234");
	sAcc.getInterestRate();
	System.out.println();
	
////sAcc is a reference variable of type checkings
    //sAcc is pointing to checkings object in the memory
	Checkings cAcc= new Checkings();
	cAcc.getAccountBalance("sgg");
	cAcc.getInterestRate();
	System.out.println();
	
	
	SpecialSavings ssAcc=new SpecialSavings();
	ssAcc.getAccountBalance("qww");
	//Multi-Level Inheritence
	ssAcc.getInterestRate(); //Here the interest is inherited from saving account as it is the immediate class
	
	}
}
