package me.xueyao.test;

import java.util.List;

import me.xueyao.domain.Customer;
import me.xueyao.utils.HibernateUtils;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.junit.Test;

public class TestQBC {
	@Test
	public void test1() {
		Session session = HibernateUtils.getCurrentSession();
		session.beginTransaction();
		
		//获取Criteria对象
		Criteria criteria = session.createCriteria(Customer.class);
		//执行查询
		List<Customer> list = criteria.list();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		session.getTransaction().commit();
	}
}
