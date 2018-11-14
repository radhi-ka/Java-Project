package com.springbasics.beanwiring;

public class Student {

	private String name;
	private Book bookprop;
	
	public Student(Book bookprop) {
		super();
		this.bookprop = bookprop;
	}
	public Student(String name) {
		super();
		this.name = name;
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Book getBookprop() {
		return bookprop;
	}
	public void setBookprop(Book bookprop) {
		this.bookprop = bookprop;
	}
	
}
