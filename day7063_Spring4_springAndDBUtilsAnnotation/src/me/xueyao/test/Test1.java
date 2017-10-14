package me.xueyao.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.xueyao.domain.Customer;
import me.xueyao.service.CustomerService;

public class Test1 {
    
    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = (CustomerService) ac.getBean("customerService");
        List<Customer> customers = customerService.findAllCustomer();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
