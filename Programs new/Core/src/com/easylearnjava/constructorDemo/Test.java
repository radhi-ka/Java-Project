package com.easylearnjava.constructorDemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//cal to a default constructor. default becoz it is not taking any arguments
Student std=new Student();
std.setId(10);
std.setName("qqq");
std.setRolno(11);
//std.setSchoolName("asd"); //here this is overriding as this value is changed from constructor
//to avoid this overriding just remove setSchoolName method in Student.java
System.out.println("Id is " + std.getId());
System.out.println("Id is " + std.getName());
System.out.println("Id is " + std.getRolno());
System.out.println("School name is " + std.getSchoolName());

Student std1 =new Student();
std1.setId(12);
std1.setName("www");
std1.setRolno(13);
System.out.println("Id is " + std1.getId());
System.out.println("Id is " + std1.getName());
System.out.println("Id is " + std1.getRolno());
System.out.println("School name is " + std1.getSchoolName());
	}

}
