package com.easylearnjava.methodoverloading;

public class Employee {


	public double calculateEmpSalary(int empId) {
		System.out.println("The Employee Salary is being calculated " +5000);
		return 5000;
	};
	/*
	  method overloading does not affect return type: here int 
	public int calculateEmpSalary(int empId) {
  System.out.println("The Employee Salary is " +5000);
	return 5000;
	} */
	public double calculateEmpSalary(int empId, String empName) {
		System.out.println("The Employee Salary is " +5000);
		return 5000;
	}

	public double calculateEmpSalary(int empId, String empName, String empType) {
		if(empType=="FT") {
			System.out.println("The Employee Salary is " +5000);
		return 5000;
		}else if (empType=="PT") {
			System.out.println("The Employee Salary is " +4000);
			return 4000;
		}else {
			System.out.println("The Employee Salary is " +2000);
			return 2000;
		}
}
}
