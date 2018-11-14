package com.springbasics.beanwiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

	public static void main(String[] args) {
		
		ApplicationContext appCon= new ClassPathXmlApplicationContext("com/springbasics/beanwiring/Spring.xml");
		Student std=(Student) appCon.getBean("studentobj1");
		System.out.println("Student Name : " + std.getName());
		System.out.println("BookProperty : " + std.getBookprop().getTitle());
	}
}
