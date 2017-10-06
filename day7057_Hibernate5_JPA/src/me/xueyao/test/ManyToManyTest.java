package me.xueyao.test;

import javax.persistence.EntityManager;

import me.xueyao.domain.SysRole;
import me.xueyao.domain.SysUser;
import me.xueyao.utils.JPAUtils;

import org.junit.Test;

/**
 * @author XueYao
 *
 */
public class ManyToManyTest {
	
	/**
	 * 保存操作
	 */
	@Test
	public void test01() {
		SysUser user1 = new SysUser();
		user1.setUser_name("张三");
		
		SysUser user2 = new SysUser();
		user2.setUser_name("李四");
		
		SysRole role1 = new SysRole();
		role1.setRole_name("角色1");
		
		SysRole role2 = new SysRole();
		role2.setRole_name("角色2");
		
		SysRole role3 = new SysRole();
		role3.setRole_name("角色3");
		
		user1.getRoles().add(role1);
		user1.getRoles().add(role2);
		
		role1.getUsers().add(user1);
		role2.getUsers().add(user1);
		
		user2.getRoles().add(role2);
		user2.getRoles().add(role3);
		
		role2.getUsers().add(user2);
		role3.getUsers().add(user2);
		
		EntityManager em = JPAUtils.getEntityManager();
		em.getTransaction().begin();
		
		em.persist(user1);
		em.persist(user2);
		//em.persist(role1);
		//em.persist(role2);
		//em.persist(role3);
		
		em.getTransaction().commit();
		em.close();
	}
}
