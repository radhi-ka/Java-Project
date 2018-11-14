package com.easylearnjava.stringdemo;

public class StringIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"hii", "hello", "bye"};
		for(int i=0; i<arr.length; i++)
		{
			System.out.println("The items are : " + arr[i]);
		}
		
System.out.println();
//Advanced for loop
//output type
//loop variable
//object to loop on
for(String st: arr) {
	System.out.println("The items are : " + st);
}
	}

}
