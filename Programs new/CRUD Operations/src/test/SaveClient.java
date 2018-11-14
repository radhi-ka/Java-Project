package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class SaveClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		Student st = new Student();
		st.setId(3);
		st.setName("BramhaN");
		st.setEmail("bk1@gmail.com");
		
		s.saveOrUpdate(st);

		//int pk = (Integer) s.save(st); // save can execute without transaction boundaries
		                              // persist can execute within transaction boundaries
		tx.commit(); // data will execute here
		s.close();
		sf.close();
		System.out.println("insertion completed successfully");

	}

}
