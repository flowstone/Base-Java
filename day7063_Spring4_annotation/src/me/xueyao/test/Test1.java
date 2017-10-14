package me.xueyao.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.xueyao.dao.UserDao;
import me.xueyao.service.UserService;

public class Test1 {
    
    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService  userService = (UserService) ac.getBean("userService");
        userService.save();
        System.out.println(userService);
        
        UserService userService1 = (UserService) ac.getBean("userService");
        System.out.println(userService1);
    }
    
    @Test
    public void test2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        userDao.save();
    }
    
  
}
