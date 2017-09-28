package me.xueyao.test;

import me.xueyao.domain.Customer;
import me.xueyao.utils.HibernateUtils;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.junit.Test;

public class TestOID {
	/**
	 * 测试OID的作用"
	 * 准备工作：去掉主键生成策略，由我们自己来指定主键值
	 */
	@Test
	public void test() {
		
		Customer customer = new Customer();
		customer.setCust_id(15L);
		customer.setCust_name("Tencent");
		customer.setCust_industry("小卡片");
		
		Customer customer2 = new Customer();
		customer2.setCust_id(15L);
		customer2.setCust_name("Tencent");
		customer.setCust_industry("小卡片");
		
		Session session = HibernateUtils.openSession();
		
		session.beginTransaction();
		
		session.save(customer);
		session.save(customer2);
		
		
		session.getTransaction().commit();
		session.close();
	}
}
