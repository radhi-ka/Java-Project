package com.easylearnjava.methodoverloading;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp= new Employee();
double sal= emp.calculateEmpSalary(1);
System.out.println("The employee salary is : " + sal);
emp.calculateEmpSalary(6);
emp.calculateEmpSalary(2, "abc");
emp.calculateEmpSalary(3, "opl", "PT");

	}

}
