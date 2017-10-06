package me.xueyao.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

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
}
