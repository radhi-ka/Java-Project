
package com.easylearnjava.exceptionhandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class compileTimeException {

	public static void main(String[] args) {
		
		FileInputStream fs = null;
		try {
			fs=new FileInputStream("c:/abc.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Complie time exception");
		
	}
	
}
