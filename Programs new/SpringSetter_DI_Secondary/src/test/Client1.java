package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beans.Car;

public class Client1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String files[]= new String[]{"resources/car1.xml","resources/engine1.xml"};
		ApplicationContext ap = new ClassPathXmlApplicationContext("resources/car-engine.xml");
		Car c=(Car)ap.getBean("c");
		c.printCarData();
	}
}