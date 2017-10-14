package me.xueyao.dao.impl;

import java.util.List;

import me.xueyao.domain.Customer;

public interface CustomerDao {
    
    /**
     * 持久层： 查询所有的客户
     * @return
     */
    List<Customer> findAllCusotmer();

}
