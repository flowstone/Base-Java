package me.xueyao.ssh.dao.impl;

import me.xueyao.ssh.dao.CustomerDao;
import me.xueyao.ssh.domain.Customer;

public class CustomerDaoImpl implements CustomerDao {

    @Override
    public void save(Customer customer) {
        System.out.println("客户保存...");
    }

    @Override
    public Customer findById(Long id) {
        System.out.println("根据id查询客户...");
        return null;
    }

}
