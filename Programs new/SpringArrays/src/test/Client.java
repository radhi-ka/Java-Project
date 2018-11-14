package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext ap=new ClassPathXmlApplicationContext("resources/Spring.xml");
Car c=(Car) ap.getBean("c");
c.printCarData();
	}

}
