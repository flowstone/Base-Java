package me.xueyao.test;

import javax.persistence.EntityManager;

import me.xueyao.domain.Customer;
import me.xueyao.domain.LinkMan;
import me.xueyao.utils.JPAUtils;

import org.junit.Test;


/**
 * 一对多操作
 * @author XueYao
 *
 */
public class OneToManyTest {
	
	/**
	 * 一对多保存
	 * 建立双向关系
	 */
	@Test
	public void save() {
		Customer customer = new Customer();
		customer.setCust_name("客户1");
		LinkMan linkMan = new LinkMan();
		linkMan.setLkm_name("联系人1");
		//建立客户和联系人的双向关系,不会有多余的update语句,因为我们在
		//一方(客户)加了mappedBy,放弃了外键维护权
		customer.getLinkMans().add(linkMan);
		linkMan.setCustomer(customer);
		
		EntityManager em = JPAUtils.getEntityManager();
		em.getTransaction().begin();
		
		em.persist(customer);
		em.persist(linkMan);
		em.getTransaction().commit();
		
		em.close();
	}
}