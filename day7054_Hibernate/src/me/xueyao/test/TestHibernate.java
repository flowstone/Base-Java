package me.xueyao.test;

import me.xueyao.domain.Customer;
import me.xueyao.utils.HibernateUtils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.junit.Test;

public class TestHibernate {

	@Test
	public void test1() {
		//要保存的对象 
		Customer customer = new Customer();
		customer.setCust_name("阿里巴巴");
		customer.setCust_industry("卖假货的");
		customer.setCust_level("VIP客户");
		customer.setCust_source("小卡片");
		customer.setCust_address("浙江杭州");
		customer.setCust_phone("8650123");
		
		//实例化Configuration对象
		Configuration cfg = new Configuration();
		//读取核心配置文件hibernate.cfg.xml
		cfg.configure();
		
		//构造SessionFactory
		SessionFactory sf = cfg.buildSessionFactory();
		//获取Session,类似于JDBC时的Connection
		Session session = sf.openSession();
		//开启事务
		session.beginTransaction();
		//保存
		session.save(customer);
		//提交事务
		session.getTransaction().commit();
		//释放资源
		session.close();
		sf.close();
	}
	
	/**
	 * 第二种读取核心配置文件
	 */
	@Test
	public void test2() {
		//要保存的对象 
		Customer customer = new Customer();
		customer.setCust_name("阿里");
		customer.setCust_industry("卖假货的");
		customer.setCust_level("VIP客户");
		customer.setCust_source("小卡片");
		customer.setCust_address("浙江杭州");
		customer.setCust_phone("8650123");
		
		//实例化Configuration对象
		Configuration cfg = new Configuration();
		//添加映射文件
		cfg.addResource("me/xueyao/domain/Customer.hbm.xml");
		
		//构造SessionFactory
		SessionFactory sf = cfg.buildSessionFactory();
		//获取Session,类似于JDBC时的Connection
		Session session = sf.openSession();
		//开启事务
		session.beginTransaction();
		//保存
		session.save(customer);
		//提交事务
		session.getTransaction().commit();
		//释放资源
		session.close();
		sf.close();
	}
	
	/**
	 * HibernateUtils工具类的用法
	 */
	@Test
	public void test3() {
		Customer customer = new Customer();
		customer.setCust_name("乐视");
		
		Session session = HibernateUtils.openSession();
		session.beginTransaction();
		//保存
		session.save(customer);
		//提交
		session.getTransaction().commit();
		
		//释放资源
		session.close();
		
	}
	
	/**
	 * 根据id查询客户 
	 */
	@Test
	public void test4() {
		Session session = HibernateUtils.openSession();
		session.beginTransaction();
		//根据id查询客户
		Customer customer = session.get(Customer.class, 1L);
		System.out.println(customer);
		
		session.getTransaction().commit();
		session.close();
		
	}
	/**
	 * 删除客户
	 */
	@Test
	public void test5() {
		Session session = HibernateUtils.openSession();
		session.beginTransaction();
		
		//根据id查询客户
		Customer customer = session.get(Customer.class, 9L);
		//删除客户
		session.delete(customer);
		
		session.getTransaction().commit();
		
		session.close();
	}
	
	/**
	 * 修改数据
	 */
	@Test
	public void test6() {
		Session session = HibernateUtils.openSession();
		session.beginTransaction();
		
		Customer customer = session.get(Customer.class, 7L);
		customer.setCust_level("白金会员");
		customer.setCust_phone("10086");
		//更新客户
		session.update(customer);
		
		session.getTransaction().commit();
		session.close();
	}
	
	/**
	 * saveOrUpdate方法:
	 * 1.没有指定id,就保存
	 * 2.如果有id,能对应到数据,就是更新
	 * 3.如果有id,表里没有记录与对应,报错
	 */
	@Test
	public void test7() {
		Session session = HibernateUtils.openSession();
		session.beginTransaction();
		
		Customer customer = new Customer();
		customer.setCust_id(7L);
		customer.setCust_name("PPTV");
		
		session.saveOrUpdate(customer);
		
		session.getTransaction().commit();
		session.close();
	}
	
	/**
	 * 使用load方法查询id为9的客户
	 */
	@Test
	public void test8() {
		Session session = HibernateUtils.openSession();
		session.beginTransaction();
		
		Customer load = session.load(Customer.class, 10L);
		System.out.println(load.getCust_name());
		
		session.getTransaction().commit();
		session.close();
	}
}
