package org.keerthi.practice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

@SuppressWarnings("deprecation")
public class DrawingApp {

	public static void main(String args[]) {
		//Triangle t=new Triangle();
		//BeanFactory factory=new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		Triangle t=(Triangle) context.getBean("Triangle");
		t.draw();
	}
}
