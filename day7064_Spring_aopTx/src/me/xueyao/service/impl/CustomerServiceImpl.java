package me.xueyao.service.impl;

import me.xueyao.dao.CustomerDao;
import me.xueyao.domain.Customer;
import me.xueyao.service.CustomerService;

public class CustomerServiceImpl implements CustomerService{
    
    private CustomerDao customerDao;//不需要手动实例化，Spring依赖注入
    
    
    
    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }



    @Override
    public void saveCustomer(Customer customer) {
        customerDao.save(customer);
    }

}
