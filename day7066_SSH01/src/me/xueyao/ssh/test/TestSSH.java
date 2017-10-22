package me.xueyao.ssh.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import me.xueyao.ssh.domain.Customer;
import me.xueyao.ssh.service.CustomerService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestSSH {
    
    @Autowired
    private CustomerService customerService;
    /**
     * 测试Spring环境是否搭建好
     */
    @Test
    public void test1() {
        customerService.saveCustomer(null);
        customerService.findCustomerById(1L);
    }
    
    /**
     * 测试hibernate环境是否搭建好
     */
    @Test
    public void test2() {
        Customer customer = new Customer();
        customer.setCust_name("阿里");
        
        Configuration cfg = new Configuration();
        //读取hibernate.cfg.xml
        cfg.configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.getCurrentSession();
        session.beginTransaction();
        session.save(customer);
        session.getTransaction().commit();
        
        session.close();
        sf.close();
    }
}
