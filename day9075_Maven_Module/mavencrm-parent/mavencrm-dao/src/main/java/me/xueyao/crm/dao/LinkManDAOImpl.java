package me.xueyao.crm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import me.xueyao.crm.domain.Customer;
import me.xueyao.crm.domain.LinkMan;

public class LinkManDAOImpl extends HibernateDaoSupport implements LinkManDAO{

	@Override
	public long findCountByCriteria(DetachedCriteria criteria) {
		//hibernate的数量查询：特殊投影查询
		criteria.setProjection(Projections.rowCount());//统计投影
		//返回的是数量
		List<Long> list = (List<Long>) getHibernateTemplate().findByCriteria(criteria);
		
		return list.isEmpty()?0:list.get(0);
	}

	@Override
	public List<LinkMan> findByCriteria(DetachedCriteria criteria, int firstResult, int maxResults) {
		//去掉投影
		criteria.setProjection(null);
		return (List<LinkMan>) getHibernateTemplate().findByCriteria(criteria, firstResult, maxResults);
	}

	@Override
	public void save(LinkMan linkMan) {
		getHibernateTemplate().save(linkMan);
	}

	@Override
	public LinkMan findById(Long lkm_id) {
		return getHibernateTemplate().get(LinkMan.class, lkm_id);
	}

	@Override
	public void update(LinkMan linkMan) {
		 getHibernateTemplate().update(linkMan);
		
	}

	@Override
	public void delete(LinkMan linkMan) {
		 getHibernateTemplate().delete(linkMan);
		
	}

}
