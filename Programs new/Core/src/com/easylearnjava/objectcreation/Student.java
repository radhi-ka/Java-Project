package com.easylearnjava.objectcreation;

public class Student {

	int id;
	String name;
	int rollno;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//std is the reference variable and pointing student obj in memory
Student std= new Student();
std.id=1;
std.name="Hal";
std.rollno=12;
System.out.println("The student 1 name is " +std.name);
Student stud=new Student();
stud.id=2;
stud.name="jak";
stud.rollno=11;
	}

}
