package me.xueyao.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static final SessionFactory sf;
	
	static {
		sf = new Configuration().configure().buildSessionFactory();
	}
	
	public static Session openSession() {
		return sf.openSession();
	}
}
