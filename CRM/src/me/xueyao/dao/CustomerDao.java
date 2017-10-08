package me.xueyao.dao;

import java.util.List;

import me.xueyao.domain.Customer;

public interface CustomerDao {

	/**
	 * 查询所有客户
	 * @return
	 */
	List<Customer> findAllCustomer();

	/**新增客户
	 * @param customer
	 */
	void save(Customer customer);

}
