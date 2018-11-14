package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.get(Student.class, 3);
		Student st = new Student();
		st.setId(3);
		st.setName("BramhaNanda");
		st.setEmail("bk167@gmail.com");

		s.merge(st);

		tx.commit(); // data will execute here
		s.close();
		sf.close();
		System.out.println("insertion completed successfully");

	}

}
