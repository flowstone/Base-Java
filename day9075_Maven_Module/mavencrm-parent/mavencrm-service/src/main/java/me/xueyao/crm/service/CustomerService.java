package me.xueyao.crm.service;

import java.util.List;

import me.xueyao.crm.domain.Customer;
import me.xueyao.crm.page.Pagination;

//客户业务层接口
public interface CustomerService {

	public void saveCustomer(Customer customer);

	//分页列表查询
	public void findCustomerListPage(Pagination<Customer> pagination);

	//根据id删除
	/*public void deleteCustomer(Long cust_id);*/
	//根据id删除-对象
	public void deleteCustomer(Customer customer);

	/**
	 * 根据id查询客户
	 * @param cust_id
	 * @return
	 */
	public Customer findCustomerById(Long cust_id);

	/**
	 * 客户更新
	 * @param customer
	 */
	public void updateCustomer(Customer customer);

	//查询所有客户列表
	public List<Customer> findCustomerList();

}
