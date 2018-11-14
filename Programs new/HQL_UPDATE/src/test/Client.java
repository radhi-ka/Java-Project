package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg= new Configuration();
		cfg.configure("resources/Student.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction tx=s.beginTransaction();
		
		Student s1=new Student(22,"banti", "ban@gmail.com");
		
	s.save(s1);
		
		
	tx.commit();
	sf.close();
	}

}
