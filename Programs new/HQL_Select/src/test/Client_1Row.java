package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Student;

public class Client_1Row {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cfg= new Configuration();
		cfg.configure("resources/Student.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s= sf.openSession();
		Transaction tx=s.beginTransaction();
		
		String hql="from Student where id=28 ";
		
		Query q= s.createQuery(hql);
		Student st=(Student)q.uniqueResult();
		
		
		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getEmail());
		
		
	tx.commit();
	
	sf.close();
	}

}
