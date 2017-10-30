package me.xueyao.crm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import me.xueyao.crm.domain.BaseDict;

//配置的时候注入session工厂
public class BaseDictDAOImpl extends HibernateDaoSupport implements BaseDictDAO {

	@Override
	public List<BaseDict> findByTypeCode(DetachedCriteria criteria) {
		return (List<BaseDict>) getHibernateTemplate().findByCriteria(criteria);
	}

}
