package com.easylearnjava.abstractdemo;

public class Circle extends Shape {

	public double radius;
	
	public double calculateArea() {
		return 3.14*radius*radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
