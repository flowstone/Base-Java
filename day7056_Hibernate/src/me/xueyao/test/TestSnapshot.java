package me.xueyao.test;

import me.xueyao.domain.Customer;
import me.xueyao.utils.HibernateUtils;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.junit.Test;

public class TestSnapshot {
	/**
	 * 测试快照机制
	 */
	@Test
	public void test() {
		
		Session session = HibernateUtils.openSession();
		session.beginTransaction();
		
		Customer customer = session.get(Customer.class, 1L);
		System.out.println(customer.getCust_name());
		
		customer.setCust_name("小贞贞");
		
		
		session.getTransaction().commit();
		
		session.close();
	}
}
