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
}
