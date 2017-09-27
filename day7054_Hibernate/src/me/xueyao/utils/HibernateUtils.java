package me.xueyao.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate的工具类,创建SessionFactory,获取Session
 * @author XueYao
 *
 */
public class HibernateUtils {
	private static final SessionFactory sf;
	
	//类加载时调用,只执行一次
	static {
		sf = new Configuration().configure().buildSessionFactory();
		
	}
	
	/**
	 * 获取Session的工具方法
	 * @return
	 */
	public static Session openSession() {
		return sf.openSession();
	}
}
