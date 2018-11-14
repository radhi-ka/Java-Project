package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class SelectGet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Object o=s.get(Student.class, 2);

		Student st = (Student)o;
		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getEmail());
		
		
		s.close();
		sf.close();
		System.out.println("Completed successfully");

	}

}
