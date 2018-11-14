package test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.PropertyProjection;

import beans.Workers;

public class AverageCriteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		
		Criteria c=s.createCriteria(Workers.class);
Projection p = Projections.avg("wsal");
c.setProjection(p);
double avg_salary=(Double)c.uniqueResult();
System.out.println(avg_salary);
	}

}
