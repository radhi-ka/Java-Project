package com.easylearnjava.extendsDemo;

public class Account {
	public double getAccountBalance(String accId) {
		System.out.println("getAccountBalance is called...");
		return 100;
	}
	public double getInterestRate(){
		System.out.println("getInterestRate is called..");
		return 2;
	}
}
