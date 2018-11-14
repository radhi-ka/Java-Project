package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class PersistClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		Student st = new Student();
		st.setId(2);
		st.setName("Keerthi");
		st.setEmail("kb@gmail.com");

		Student st1 = new Student();
		st1.setId(1);
		st1.setName("Bramha");
		st1.setEmail("bk@gmail.com");
		
		s.persist(st);// wont return primary key
		s.persist(st1);
		tx.commit(); // data will execute here
		s.close();
		sf.close();
		System.out.println("insertion completed successfully");

	}

}
