package com.woniu.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory sessionFactory;
	static ThreadLocal<Session> tl=new ThreadLocal<Session>();
	static {
		Configuration con=new Configuration().configure();
		sessionFactory =con.buildSessionFactory();
	}
	
	public static Session getSession() {
		Session session=tl.get();
		if(session==null) {
			session=sessionFactory.openSession();
			tl.set(session);
		}
		return session;
	}
	public static void closeSession() {
		Session session=tl.get();
		if(session!=null) {
			session.close();
			tl.set(null);
		}
	}
}
