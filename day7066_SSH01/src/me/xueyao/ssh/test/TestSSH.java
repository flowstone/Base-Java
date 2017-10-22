package me.xueyao.ssh.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import me.xueyao.ssh.service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSSH {
    
    @Autowired
    private CustomerService customerService;
    
    @Test
    public void test1() {
        customerService.saveCustomer(null);
        customerService.findCustomerById(1L);
    }
}
