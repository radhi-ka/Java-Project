package com.easylearnjava.Constructorchaining;

public class mustang extends Car {
	
	public mustang() {
		System.out.println("Default Constructor");
	}
	
	public mustang(String name) {
		System.out.println("mustang with name Parameterized Constructor");
	}
	
	public mustang(String name, int id) {
		this("shd");
		System.out.println("mustang Parameterized Constructor");
	}
}
