package test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Client {

	public static void main(String[] args) {
		Resource resource= new ClassPathResource("resources/Spring.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		System.out.println("Value valid....");
		factory.getBean("t");
	}
}
      