package com.springbasics.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	public static void main(String[] args) {

		ApplicationContext appContext=new ClassPathXmlApplicationContext("com/springbasics/constructorinjection/Spring.xml");
		Address add=(Address) appContext.getBean("Add");
		add.getCity();
		System.out.println("City= "+ add.getCity() + "," + add.getState());
	}

}
