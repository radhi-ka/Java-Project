package test;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


import beans.Student;

public class Client_1Column {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg= new Configuration();
		cfg.configure("resources/Student.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction tx=s.beginTransaction();
		
		String hql="Select name from Student ";
		
		Query q= s.createQuery(hql);
		List<String> list=q.list();
		
		for(String name:list) {
			System.out.println(name);
		}
		

		
	tx.commit();
	
	sf.close();
	}

}
