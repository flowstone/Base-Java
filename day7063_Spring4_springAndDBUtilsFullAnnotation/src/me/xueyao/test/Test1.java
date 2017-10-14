package me.xueyao.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import me.xueyao.config.SpringConfig;
import me.xueyao.domain.Customer;
import me.xueyao.service.CustomerService;

public class Test1 {
    
    @Test
    public void test1() {
        //ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfig.class);
        CustomerService customerService = (CustomerService) ac.getBean("customerService");
        List<Customer> customers = customerService.findAllCustomer();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}
