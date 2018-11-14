package com.easylearnjava.constructorDemo;

public class Dummy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student std = new Student();
		std.setId(10);
		std.setName("qqq");
		std.setRolno(11);
		System.out.println("Id is " + std.getId());
		System.out.println("Id is " + std.getName());
		System.out.println("Id is " + std.getRolno());
		System.out.println("School name is " + std.getSchoolName());
		System.out.println("------------------------------");
	
		//way of using constructor.
		Student std1=new Student(2,"sd",4,"qas");
		System.out.println("Id is " + std1.getId());
		System.out.println("Id is " + std1.getName());
		System.out.println("Id is " + std1.getRolno());
		System.out.println("School name is " + std1.getSchoolName());
		
		Student std2=new Student(3, "yu");
		System.out.println("Id is " + std2.getId());
		System.out.println("Id is " + std2.getName());
	}

}
