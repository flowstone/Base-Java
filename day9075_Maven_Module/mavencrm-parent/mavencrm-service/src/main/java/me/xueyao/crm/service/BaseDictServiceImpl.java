package me.xueyao.crm.service;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import me.xueyao.crm.dao.BaseDictDAO;
import me.xueyao.crm.domain.BaseDict;

public class BaseDictServiceImpl implements BaseDictService{
	//注入dao
	private BaseDictDAO baseDictDAO;
	public void setBaseDictDAO(BaseDictDAO baseDictDAO) {
		this.baseDictDAO = baseDictDAO;
	}


	@Override
	public List<BaseDict> findBaseDictByTypeCode(String dict_type_code) {
		//条件拼接
		DetachedCriteria criteria=DetachedCriteria.forClass(BaseDict.class)
				.add(Restrictions.eq("dict_type_code", dict_type_code));
		
		return baseDictDAO.findByTypeCode(criteria);
	}

}
