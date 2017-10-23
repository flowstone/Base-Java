package me.xueyao.ssh.dao;

import me.xueyao.ssh.domain.Customer;

public interface CustomerDao {
    
    /**
     * 保存客户
     * @param customer
     */
    public void save(Customer customer);

    /**
     * 查询客户
     * @param id
     * @return
     */
    public Customer findById(Long id);

}
