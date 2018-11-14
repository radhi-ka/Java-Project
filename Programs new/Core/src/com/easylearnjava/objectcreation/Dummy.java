package com.easylearnjava.objectcreation;

public class Dummy {
	public static void main(String[] args) {
		Student s=new Student();
		s.id=13;
		s.name="jss";
		s.rollno=111;
		
		Account acc=new Account();
		//acc.setIntialbalance(100); //assign a value
		System.out.println(acc.getIntialbalance());
	}
}
