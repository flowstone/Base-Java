package me.xueyao.crm.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

//通用dao接口
public interface BaseDAO<T,ID extends Serializable> {
	
	//保存
	public void save(Object domain);
	//更新
	public void update(Object domain);
	//删除
	public void delete(Object domain);
	
	//根据id查询
	public T findById(Class<T> domainClass, ID id);
	
	//查询所有数据
	public List<T> loadAll(Class<T> domainClass);
	
	//复杂条件查询
	//qbn
	public List<T> findByNamedQuery(String queryName, Object... values) ;
	//qbc
	public List<T> findByCriteria(DetachedCriteria criteria);
	
	//分页qbc
	//数量
	public long findCountByCriteria(DetachedCriteria criteria);
	
	//当前页列表
	public List<T> findByCriteria(DetachedCriteria criteria, int firstResult, int maxResults);
}
