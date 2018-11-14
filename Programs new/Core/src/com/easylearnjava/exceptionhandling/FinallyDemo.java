package com.easylearnjava.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FinallyDemo {     //Finally block will be executed even if there is exception or not

	public static void main(String[] args) {
		
				try {
					/* FileInputStream fs = null;
					fs=new FileInputStream("c:/abc.txt");
					
					String s = null;
					s.length();

					int[] arr = new int[5];
					arr[8] = 2;
					
					int a = 10, b = 0;
					int c = a / b;
					System.out.println("The value of c is " + c);  */
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Error");
					e.printStackTrace(); // will print which type of error is it
				} catch (ArithmeticException ex) {
					System.out.println("ArithmeticError");
					ex.printStackTrace();
				} /* catch (FileNotFoundException e) { 
				
					System.out.println("Compile Time Error");
				}   */
				catch(Exception e) {  // While writing multiple exception handling always use Exception e in the last
                    // This is because as Exception e is the parent it can handle any type of
                    // exception so either
                    // use only single Exception e or use it at last.
					System.out.println("parent class exception");
				}
finally {
				System.out.println("12345");
		
	}
}
}
