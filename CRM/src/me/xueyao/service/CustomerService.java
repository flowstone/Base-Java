package me.xueyao.service;

import java.util.List;

import me.xueyao.domain.Customer;

public interface CustomerService {
	
	/** 查询所有客户
	 * @return
	 */
	List<Customer> findAllCustomer();

	/**新增客户
	 * @param customer
	 */
	void save(Customer customer);

}
