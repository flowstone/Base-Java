package me.xueyao.ssh.service;

import me.xueyao.ssh.domain.Customer;

public interface CustomerService {
    
    /**
     * 保存客户
     * @param customer
     */
    public void saveCustomer(Customer customer);
    
    /**
     * 查询客户
     * @param id
     * @return
     */
    public Customer findCustomerById(Long id);
}
