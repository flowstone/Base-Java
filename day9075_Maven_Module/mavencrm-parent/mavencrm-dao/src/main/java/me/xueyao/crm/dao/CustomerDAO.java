package me.xueyao.crm.dao;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

import me.xueyao.crm.domain.Customer;

public interface CustomerDAO {

	public void save(Customer customer);
	//查询所有的客户数量
	public long findCountByCriteria(DetachedCriteria criteria);
	//分页查询
	public List<Customer> findByCriteria(DetachedCriteria criteria, int firstResult, int maxResults);
	
	public void delete(Customer customer);
	//根据id查询
	public Customer findById(Long cust_id);
	//更新
	public void update(Customer customer);
	//查询所有
	public List<Customer> findAll();
	

}
