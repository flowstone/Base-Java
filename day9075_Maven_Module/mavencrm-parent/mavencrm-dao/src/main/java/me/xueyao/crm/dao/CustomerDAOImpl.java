package me.xueyao.crm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import me.xueyao.crm.domain.Customer;

public class CustomerDAOImpl extends HibernateDaoSupport implements CustomerDAO{

	@Override
	public void save(Customer customer) {
		getHibernateTemplate().save(customer);
	}

	@Override
	public long findCountByCriteria(DetachedCriteria criteria) {
		//hibernate的数量查询：特殊投影查询
		criteria.setProjection(Projections.rowCount());//统计投影
		//返回的是数量
		List<Long> list = (List<Long>) getHibernateTemplate().findByCriteria(criteria);
		
		return list.isEmpty()?0:list.get(0);
	}

	@Override
	public List<Customer> findByCriteria(DetachedCriteria criteria, int firstResult, int maxResults) {
		//去掉投影
		criteria.setProjection(null);
		return (List<Customer>) getHibernateTemplate().findByCriteria(criteria, firstResult, maxResults);
	}

	@Override
	public void delete(Customer customer) {
		//支持脱管态和持久态的删除：oid
		getHibernateTemplate().delete(customer);
		
	}

	@Override
	public Customer findById(Long cust_id) {
		return getHibernateTemplate().get(Customer.class, cust_id);
	}

	@Override
	public void update(Customer customer) {
		getHibernateTemplate().update(customer);
		
	}

	@Override
	public List<Customer> findAll() {
		return getHibernateTemplate().loadAll(Customer.class);
	}

}
