package com.easylearnjava.abstractdemo;

public class Rectangle extends Shape {

	// you can avoid using of abstract keyword in this class by overriding a method.
	// you will avoid using abstract keyword becoz you want to use or create objects
	public double length;
	public double bredth;
	
	public double calculateArea() {
		return length * bredth;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getBredth() {
		return bredth;
	}

	public void setBredth(double bredth) {
		this.bredth = bredth;
	}

	
}
