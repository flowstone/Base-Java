package me.xueyao.test;

import java.util.List;

import me.xueyao.domain.Customer;
import me.xueyao.utils.HibernateUtils;

import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.Test;

public class TestHQL {
	/**
	 * 查询表时的所有数据
	 * sql语名的写法: select * from 表名
	 * from 类名
	 */
	@Test
	public void test1() {
		Session session = HibernateUtils.getCurrentSession();
		session.beginTransaction();
		
		//获取Query对象
		Query query = session.createQuery("from Customer");
		
		
		//执行Query
		List<Customer>  list = query.list();
		for (Customer customer : list) {
			System.out.println(customer);
		}
		
		session.getTransaction().commit();
	}
	
	/**
	 * 条件查询
	 */
	@Test
	public void test02() {
		Session session = HibernateUtils.getCurrentSession();
		session.beginTransaction();
		
		//获取Query对象
		Query query = session.createQuery("from Customer where cust_name like ?");
		
		//设置参数
		query.setString(0, "%百%");
		
		//执行Query
		List<Customer> list = query.list();
		
		for (Customer customer : list) {
			System.out.println(customer);
		}
		
		session.getTransaction().commit();
	}
	
	/**
	 * 分页查询
	 */
	
	@Test
	public void test03() {
		Session session = HibernateUtils.getCurrentSession();
		session.beginTransaction();
		
		//获取Query对象
		Query query = session.createQuery("from Customer");
		//设置分页的信息
		//设置开始查询的位置
		query.setFirstResult(1);
		//设置查询的最大记录数
		query.setMaxResults(3);
		//执行Query
		List<Customer> list = query.list();
		for (Customer customer : list) {
			System.out.println(customer);
		}
		
		
		session.getTransaction().commit();
	}
	
	/**
	 * 排序查询
	 * 使用order by 关键字
	 * asc默认升序
	 * desc降序
	 * 
	 */
	@Test
	public void test04() {
		Session session = HibernateUtils.getCurrentSession();
		session.beginTransaction();
		
		//创建一个Query对象
		Query query = session.createQuery("from Customer order by cust_id desc");
		//执行Query
		List<Customer> list = query.list();
		for (Customer customer : list) {
			System.out.println(customer);
		}
		
		session.getTransaction().commit();
		
	}
	/**
	 * 统计查询,使用聚合函数查询
	 * 使用聚合函数,不使用group by 子句,只能查询到一行一列的数据
	 * 
	 */
	@Test
	public void test05() {
		Session session = HibernateUtils.getCurrentSession();
		session.beginTransaction();
		
		//创建Query对象
		Query query = session.createQuery("select count(*) from Customer");
		//执行Query
		//当确定结果集只有一行数据时,才使用uniqueResult
		//count函数查询到值是long值
		long total = (long) query.uniqueResult();
		System.out.println(total);
				
		session.getTransaction().commit();
	}
	
	/**
	 * * 投影查询
	 * 投影：使用一个实体的部分字段信息，来构建实体类对象，叫做对象的投影（在hibernate中的叫法）
	 * 	使用HQL的方式查询实体类的部分字段信息，并且封装到实体类中。(QBC也能实现投影查询，但是不如hql的好用，所以使用投影查询，一般都用HQL)
	 * HQL语句的写法：
	 * 	 select  new Customer() from Customer  
	 * 	 * 实体类要求：
	 * 	必须提供一个相同参数列表的构造函数
	 *

	 */
	
	@Test
	 public void test6() {
		 Session session = HibernateUtils.getCurrentSession();
		 session.beginTransaction();
		 
		 Query query = session.createQuery("select  new Customer(cust_id,cust_name) from Customer");
		 List<Customer> list = query.list();
		 for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		 
		 session.getTransaction().commit();;
		 
	 }
}
