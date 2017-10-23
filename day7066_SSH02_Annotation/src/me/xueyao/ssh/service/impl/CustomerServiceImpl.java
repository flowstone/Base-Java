package me.xueyao.ssh.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import me.xueyao.ssh.dao.CustomerDao;
import me.xueyao.ssh.domain.Customer;
import me.xueyao.ssh.service.CustomerService;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {
    
    @Autowired
    private CustomerDao customerDao; //依赖注入
    
    
    @Override
    public void saveCustomer(Customer customer) {
        customerDao.save(customer);
    }
    
    @Transactional(readOnly=true)
    @Override
    public Customer findCustomerById(Long id) {
        return customerDao.findById(id);
    }

}
