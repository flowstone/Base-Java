package me.xueyao.crm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import me.xueyao.crm.domain.User;

//dao实现
//将来注入session工厂就可以拥有模版类
public class UserDAOImpl extends HibernateDaoSupport implements UserDAO{

	@Override
	public void save(User user) {
		getHibernateTemplate().save(user);
	}

	@Override
	public User findByUsernameAndPassword(String user_code, String user_password) {
//		getHibernateTemplate().find("from User where user_code =? and  user_password=?", user_code,user_password);
		
		DetachedCriteria criteria=DetachedCriteria.forClass(User.class)
				.add(Restrictions.eq("user_code", user_code))
				.add(Restrictions.eq("user_password", user_password));
		List<User> userList = (List<User>) getHibernateTemplate().findByCriteria(criteria);
		
		return userList.isEmpty()?null:userList.get(0);
	}

	@Override
	public List<User> findAll() {
		return getHibernateTemplate().loadAll(User.class);
	}

	
}
