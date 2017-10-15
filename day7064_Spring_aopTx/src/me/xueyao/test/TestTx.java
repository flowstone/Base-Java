package me.xueyao.test;



import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import me.xueyao.domain.Customer;
import me.xueyao.service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestTx {
    
    @Autowired
    private CustomerService customerService;
    
    @Test
    public void test1() {
       Customer customer = new Customer();
       customer.setCust_name("小货币");
       customerService.saveCustomer(customer);
    }
}
