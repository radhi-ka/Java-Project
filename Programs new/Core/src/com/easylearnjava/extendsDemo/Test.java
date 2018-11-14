package com.easylearnjava.extendsDemo;

public class Test {

		public static void main(String args[]) {
			
		//acc is a reference variable of type account
	    //acc is pointing to account object in the memory
		Account acc=new Account();
		
		
		////sAcc is a reference variable of type savings
	    //sAcc is pointing to savings object in the memory
		Savings sAcc=new Savings();
		
		
	//sAcc is a reference variable of type checkings
	    //sAcc is pointing to checkings object in the memory
		Checkings cAcc= new Checkings();
		
		//ssAcc is a reference variable of type SpecialsSavings
	    //ssAcc is pointing to SpecialsSavings object in the memory
		SpecialSavings ssAcc=new SpecialSavings();
		
		//account is a reference variable of type account
	    //account is pointing to account object in the memory
		Account account=new Account();
		account=new Account();
		account.getAccountBalance("aaa");
		account.getInterestRate();
		//acc is a reference variable of type account
	    //acc is pointing to SavingsAccount object in the memory
		account=new Savings();
		account.getAccountBalance("fff");
		account.getInterestRate();
		
		//acc is a reference variable of type account
	    //acc is pointing to Checkings object in the memory
		account=new Checkings();
		account.getAccountBalance("ppp");
		account.getInterestRate();
		
		
	//acc is a reference variable of type account
	    //acc is pointing to SpecialSavings object in the memory
		account=new SpecialSavings();
		account.getAccountBalance("qqq");
		account.getInterestRate();
		}
	}


