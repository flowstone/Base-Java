package me.xueyao.crm.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

//通用dao实现
public class BaseDAOImpl<T,ID extends Serializable> extends HibernateDaoSupport implements BaseDAO<T, ID>{

	@Override
	public void save(Object domain) {
		getHibernateTemplate().save(domain);
	}

	@Override
	public void update(Object domain) {
		getHibernateTemplate().update(domain);
		
	}

	@Override
	public void delete(Object domain) {
		getHibernateTemplate().delete(domain);
		
	}

	@Override
	public T findById(Class<T> domainClass, ID id) {
		return getHibernateTemplate().get(domainClass, id);
	}

	@Override
	public List<T> loadAll(Class<T> domainClass) {
		return getHibernateTemplate().loadAll(domainClass);
	}

	@Override
	public List<T> findByNamedQuery(String queryName, Object... values) {
		return (List<T>) getHibernateTemplate().findByNamedQuery(queryName, values);
	}

	@Override
	public List<T> findByCriteria(DetachedCriteria criteria) {
		return  (List<T>) getHibernateTemplate().findByCriteria(criteria);
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
	public List<T> findByCriteria(DetachedCriteria criteria, int firstResult, int maxResults) {
		criteria.setProjection(null);
		return (List<T>) getHibernateTemplate().findByCriteria(criteria, firstResult, maxResults);
	}
	

}
