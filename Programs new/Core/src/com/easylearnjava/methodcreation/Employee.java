package com.easylearnjava.methodcreation;

public class Employee {

	//Access Modifiers (private,public,protected,default)
	//Return Type
	//Method Name
	//Input Arguments-->optional
	//Method Body
	//Return Statement-->optional

public void sayHello() {
	System.out.println("Hello");	
}

//method declaration with argument
public void wishUser(String name) {
	System.out.println("Hello "+name);
}

public void add(int num1, float num2, double num3, int num4 ){
	System.out.println(num1+num2+num3+num4);
}

public double multiply(int num1, double num2) {
	double d=num1*num2;
	return d;
	//or just return num1*num2;
	}
public String sayGoodnight(String name) {
	return "Good Night " + name;

}
}


