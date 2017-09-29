package me.xueyao.test;

import me.xueyao.domain.Customer;
import me.xueyao.utils.HibernateUtils;

import org.hibernate.Session;
import org.junit.Test;

public class TestTransaction {
	
	/**
	 * 测试getCurrentSession,是否是从当前线程中获取
	 */
	@Test
	public void test01() {
		Session session = HibernateUtils.getCurrentSession();
		Session session1 = HibernateUtils.getCurrentSession();
		
		//true
		System.out.println(session == session1);
	}
	
	/**
	 * 测试openSession是否是从当前线程中获取session
	 */
	@Test
	public void test02() {
		Session session = HibernateUtils.openSession();
		Session session1 = HibernateUtils.openSession();
		
		System.out.println(session == session1);
	}
	
	@Test
	public void test03() {
		Session session = HibernateUtils.getCurrentSession();
		session.beginTransaction();
		
		Customer customer = new Customer();
		customer.setCust_name("库里");
		session.save(customer);
		
		session.getTransaction().commit();
		//session.close();  session已经关闭
	}
}
