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
		Student s2=new Student(24,"kutti", "ban@gmail.com");
		Student s3=new Student(26,"chinti", "ban@gmail.com");
		Student s4=new Student(28,"chintu", "ban@gmail.com");
		Student s5=new Student(32,"chanti", "ban@gmail.com");
		

		s.save(s1);
		s.save(s2);
		s.save(s3);
		s.save(s4);
		s.save(s5);
		
		
	tx.commit();
	sf.close();
	}

}
