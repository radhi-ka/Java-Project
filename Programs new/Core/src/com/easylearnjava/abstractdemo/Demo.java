package com.easylearnjava.abstractdemo;

public class Demo {
	
	public static void main(String args[]) {
 /* Shape s= new Shape();   // Object cannot be created because Shape is an abstract class
 s.printColor(); */

Circle c=new Circle();
c.printColor();
c.setRadius(2);
System.out.println("The area of a circle is " + c.calculateArea() );

Rectangle r= new Rectangle();
r.printColor();
r.setBredth(5);
r.setLength(2);
System.out.println("The area is " + r.calculateArea());


Shape sh=new Circle();
sh=new Rectangle();

	}


}
