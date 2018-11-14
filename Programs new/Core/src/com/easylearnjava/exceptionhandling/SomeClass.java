package com.easylearnjava.exceptionhandling;

public class SomeClass {

	public double divide(int a, int b) {
		try {
			if (b == 0) {
				throw new ArithmeticException("juhsda");
			}
			

			return a / b;
		} catch (Exception e) {
			System.out.println("Error");
			throw new ArithmeticException("juhsda");
			// return -1;
		}
	}
}
