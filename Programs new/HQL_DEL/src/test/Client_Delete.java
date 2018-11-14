package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client_Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg= new Configuration();
		cfg.configure("resources/Student.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction tx=s.beginTransaction();
		
		String hql="delete Student where id=22 ";
		
		Query q= s.createQuery(hql);
		int i=q.executeUpdate();
		
	tx.commit();
	System.out.println(i);
	sf.close();
	}

}
