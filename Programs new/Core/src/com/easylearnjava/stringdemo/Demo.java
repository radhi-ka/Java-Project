/**
 * 
 */
package com.easylearnjava.stringdemo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This declaration uses StringPool to store its value
		//s1=111, s2=111
String s1="ram"; //111
String s2="ram";//111
s1="laa"; //123 //now s1=laa at a position s1=222. And s1=ram is removed by garbage collector
String s9="ell"; //113
String s8="ell"; //113
//This declaration uses memory in heap
String s3=new String("raghu");//222
String s5=new String("raghu");  //223 //This uses new memory location as we used new keyword
String s4=new String("seetha"); //224

//checks for the memory allocation is same or not
if(s1==s2) {
	System.out.println("true");
}
else {
	System.out.println("false");
}

//checks for the content in the memory location

if(s3.equals(s5)) {
	System.out.println("same value");
}else {
	System.out.println("different value");
}


	
	
	}

}
