package test;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.OldStudent;

public class HQL_TABLE_TABLE {
public static void main(String[] args) {
	
	Configuration cfg= new Configuration();
	cfg.configure("resources/Hibernate.cfg.xml");
	SessionFactory sf=cfg.buildSessionFactory();
	Session s= sf.openSession();
	Transaction tx=s.beginTransaction();
	
	String HQL= "insert into NewStudent(id,name,email) select id, name, email from OldStudent";
Query q= s.createQuery(HQL);
int i= q.executeUpdate();
System.out.println("No rows dumped from oldstudent to newstudent");

	
tx.commit();
sf.close();
}
	
	
}
