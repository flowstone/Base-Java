package me.xueyao.test;

import me.xueyao.domain.Customer;
import me.xueyao.utils.HibernateUtils;

import org.hibernate.Session;
import org.junit.Test;

public class TestHibernate {
	@Test
	public void test() {
		Customer customer = new Customer();
		customer.setCust_name("小明");
		customer.setCust_source("百度");
		customer.setCust_industry("广告");
		customer.setCust_level("白金");
		customer.setCust_address("上海");
		customer.setCust_phone("10086");
		Session session = HibernateUtils.openSession();
		session.beginTransaction();
		
		session.save(customer);
		session.getTransaction().commit();
		
		session.close();
		
		
	}
}
