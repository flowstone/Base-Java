package me.xueyao.test;

import me.xueyao.domain.Customer;
import me.xueyao.utils.HibernateUtils;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.junit.Test;

public class TestSessionCache {
	/**
	 * 测试hibernate一级缓存的存在
	 */
	@Test
	public void test() {
		
		Session session = HibernateUtils.openSession();
		session.beginTransaction();
		
		Customer customer = session.get(Customer.class, 1L);
		System.out.println(customer);
		
		Customer customer2 = session.get(Customer.class, 1L);
		System.out.println(customer2);
		
		System.out.println(customer == customer2);
		
		session.getTransaction().commit();
		
		session.close();
	}
}
