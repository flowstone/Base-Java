package me.xueyao.test;

import me.xueyao.domain.Customer;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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

}
