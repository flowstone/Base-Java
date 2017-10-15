package me.xueyao.utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * 工厂类，（切面类）
 * @author XueYao
 *
 */
public class HibernateUtils {
	private static final SessionFactory sf;
	
	static {
		sf = new Configuration().configure().buildSessionFactory();
	}
	
	/**
	 * 实例工厂方法
	 * @return
	 */
	public  Session getCurrentSession() {
		return sf.getCurrentSession();
	}
	
	/**
	 * 前置通知：开启事务
	 */
	public void beginTransaction() {
	    getCurrentSession().beginTransaction();
	}
	
	/**
	 * 后置通知:提交事务
	 */
	public void commitTransaction() {
	    getCurrentSession().getTransaction().commit();
	}
	
	/**
	 * 异常通知：回滚事务
	 */
	public void rollbackTransaction() {
	    getCurrentSession().getTransaction().rollback();
	}
}
