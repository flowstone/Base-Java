package me.xueyao.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import me.xueyao.domain.Customer;
import me.xueyao.utils.JPAUtils;

import org.junit.Test;

/**
 * 
 * @author XueYao
 *
 */
/**
 * @author XueYao
 *
 */
public class JPATest {
	
	/**
	 * 测试JAP注解里的保存
	 */
	@Test
	public void test01(){
		Customer customer = new Customer();
		customer.setCust_name("张三123");
		//获取JPA中实体管理器
		EntityManager em = JPAUtils.getEntityManager();
		//获取事务,
		EntityTransaction tx = em.getTransaction();
		//开启事务
		tx.begin();
		
		//保存对象
		em.persist(customer);
		//提交事务
		tx.commit();
		//释放资源
		em.close();
		
	}
	
	
	/**
	 * 查询一个
	 */
	@Test
	public void test02() {
		//获取JPA中实体管理器
		EntityManager em = JPAUtils.getEntityManager();
		//开启事务
		em.getTransaction().begin();
		
		Customer customer = em.find(Customer.class, 1L);
		System.out.println(customer);
		
		//提交事务
		em.getTransaction().commit();
		//释放资源
		em.close();
	}
	
	/**
	 * 查询一个:缓存问题
	 */
	@Test
	public void test02Cache() {
		EntityManager em = JPAUtils.getEntityManager();
		em.getTransaction().begin();
		Customer customer1 = em.find(Customer.class, 1L);
		Customer customer2 = em.find(Customer.class, 1L);
		
		System.out.println(customer1 == customer2);
		
		
		em.getTransaction().commit();
		
		em.close();
	}
	
	/**
	 * 查询一个:延迟加载的问题
	 */
	@Test
	public void test02Lazy() {
		EntityManager em = JPAUtils.getEntityManager();
		
		em.getTransaction().begin();
		
		Customer customer = em.getReference(Customer.class, 1L);
		System.out.println(customer);
		
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * 查询所有:利用JPQL来查询
	 * JPQL是Java Persistence Query Language,中文含义是ava持久化查询语言
	 * sql中可以给表起别名,例如:select * from cst_customer c
	 * JPQL语法规定: 要给类加别名,例如select c from Customer c, 表示查询表里有数的数据
	 *  
	 */
	@Test
	public void test03() {
		EntityManager em = JPAUtils.getEntityManager();
		em.getTransaction().begin();
		
		Query query = em.createQuery("select c from Customer c where c.cust_name like ?");
		query.setParameter(1, "%张%");
		List<Customer> list = query.getResultList();
		for (Customer c : list) {
			System.out.println(c);
		}
		em.getTransaction().commit();
		em.close();
	}
	
	/**
	 * 更新
	 */
	@Test
	public void update() {
		EntityManager em = JPAUtils.getEntityManager();
		em.getTransaction().begin();
		Customer customer = em.find(Customer.class, 1L);
		customer.setCust_address("上海浦东");
		
		
		em.getTransaction().commit(); //使用JPA中快照机制实现更新
		em.close();
	}
	
	
	/**
	 * 删除 
	 */
	@Test
	public void delete() {
		EntityManager em = JPAUtils.getEntityManager();
		em.getTransaction().begin();
		
		Customer customer = em.find(Customer.class, 2L);
		em.remove(customer);
		
		
		em.getTransaction().commit();
		em.close();
	}
}
