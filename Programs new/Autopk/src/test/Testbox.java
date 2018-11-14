package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.BookMovie;

public class Testbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("resources/movie.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();

		BookMovie bm = new BookMovie();
		
		bm.setShowTime("11pm");
		bm.setMovie("On");
		bm.setSeatNo(10);

		int pk = (Integer)s.save(bm);
		tx.commit();
		s.close();
		System.out.println("finished");

	}

}
