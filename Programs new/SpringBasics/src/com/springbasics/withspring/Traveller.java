package com.springbasics.withspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Traveller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext appContext= new ClassPathXmlApplicationContext("com/springbasics/withspring/Spring.xml");
	Vechicle veh= (Vechicle) appContext.getBean("VecBike");
	veh.move();
	
	Vechicle veh1= (Vechicle) appContext.getBean("VecCar");
	veh1.move();
	}

}
