package com.easylearnjava.methodcreation;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp=new Employee();
emp.sayHello();
//method calling
emp.wishUser("raghu");
emp.add(2,2.3f,3.3,11);
double output=emp.multiply(12, 11.1);
System.out.println(output);
System.out.println(emp.multiply(11, 11.2));
System.out.println(emp.sayGoodnight("bramha"));

	}

}
