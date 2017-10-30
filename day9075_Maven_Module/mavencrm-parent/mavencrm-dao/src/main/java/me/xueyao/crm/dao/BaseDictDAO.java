package me.xueyao.crm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import me.xueyao.crm.domain.BaseDict;

//数据字典持久层
public interface BaseDictDAO {

	public List<BaseDict> findByTypeCode(DetachedCriteria criteria);

}
