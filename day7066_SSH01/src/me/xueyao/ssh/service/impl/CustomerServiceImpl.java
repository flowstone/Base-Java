package me.xueyao.ssh.service.impl;

import me.xueyao.ssh.dao.CustomerDao;
import me.xueyao.ssh.domain.Customer;
import me.xueyao.ssh.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
    
    private CustomerDao customerDao; //依赖注入
    
    

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerDao.save(customer);
    }

    @Override
    public Customer findCustomerById(Long id) {
        return customerDao.findById(id);
    }

}
