package com.easylearnjava.constructorDemo;

public class Student {

	private int id;
	private String name;
	private int rolno;
	private String SchoolName;
	
	
	public Student() {
		System.out.println("Hello I am learning Java");
		SchoolName="RBVR";
	}
	
	
	//constructor declaration
	public Student(int idno, String namen, int rolnum, String schoolNames) {
		
		this.id = idno;
		this.name = namen;
		this.rolno = rolnum;
		SchoolName = schoolNames;
	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRolno() {
		return rolno;
	}
	public void setRolno(int rolno) {
		this.rolno = rolno;
	}
	public String getSchoolName() {
		return SchoolName;
	}
	/* public void setSchoolName(String schoolName) {
		SchoolName = schoolName;
	} */
	
}
