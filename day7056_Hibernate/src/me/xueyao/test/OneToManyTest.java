package me.xueyao.test;

import me.xueyao.domain.Customer;
import me.xueyao.domain.LinkMan;
import me.xueyao.utils.HibernateUtils;

import org.hibernate.Session;
import org.junit.Test;


/**
 * 一对多关系操作
 * @author XueYao
 *
 */
public class OneToManyTest {
	
	/**
	 * 一对多的普通保存
	 * 设置联系人属性于哪个客户，同时也设置客户下有哪些联系人
	 */
	@Test
	public void test01() {
		//创建客户对象
		Customer customer = new Customer();
		customer.setCust_name("阿里巴巴");
		
		//创建联系人对象
		LinkMan linkMan = new LinkMan();
		linkMan.setLkm_name("马云");
		
		//设置联系人属于哪个客户
		linkMan.setCustomer(customer);
		
		//设置客户下有哪些联系人
		customer.getLinkMans().add(linkMan);
		
		Session session = HibernateUtils.getCurrentSession();
		session.beginTransaction();
		//先保存客户
		session.save(customer);
		//再保存联系人
		session.save(linkMan);
		session.getTransaction().commit();
	}
}
