package me.xueyao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.xueyao.dao.CustomerDao;
import me.xueyao.domain.Customer;
import me.xueyao.service.CustomerService;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
    
    //不需要再手动实例化，可以通过Spring依赖注入进来
    @Autowired
    private CustomerDao customerDao;
    
    /*
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }*/


    @Override
    public List<Customer> findAllCustomer() {
        return customerDao.findAllCusotmer();
    }

}
