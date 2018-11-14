package com.easylearnjava.exceptionhandling;

public class RunTimeExceptions {

	public static void main(String[] args) {
		try {
			String s = null;
			s.length();

			int[] arr = new int[5];
			arr[8] = 2;
			int a = 10, b = 0;
			int c = a / b;
			System.out.println("The value of c is " + c);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error");
			e.printStackTrace(); // will print which type of error is it
		} catch (ArithmeticException ex) {
			System.out.println("ArithmeticError");
			ex.printStackTrace();
		} catch (Exception e) { // While writing multiple exception handling always use Exception e in the last
		                      // This is because as Exception e is the parent it can handle any type of
		                      // exception so either
		                      // use only single Exception e or use it at last.
		
			System.out.println("Null Pointer Error");
		}

		System.out.println("12345");
	}

}
