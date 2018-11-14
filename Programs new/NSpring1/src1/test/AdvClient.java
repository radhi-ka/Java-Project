package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AdvClient {

	public static void main(String[] args) {
		
		ApplicationContext ap=new ClassPathXmlApplicationContext("resources/AdvSpring.xml");
		//check xml doc
		//Create instance to singleton beans
		//If the scope in xml file is defined as singleton, it will allow to print only one object
		//if prototype them multiple values
		ap.getBean("t");
		ap.getBean("t");
		ap.getBean("t");
		
		
	}
	
}
