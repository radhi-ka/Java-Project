package com.easylearnjava.Constructorchaining;

public class Challenger extends Car {
	public Challenger() {
		System.out.println("Challenger Default Constructor");
	}
	
	public Challenger(String name) {
		super();
		System.out.println("Parameterized Constructor");
	}
	
}
