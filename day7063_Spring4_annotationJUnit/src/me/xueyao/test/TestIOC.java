package me.xueyao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import me.xueyao.dao.UserDao;
import me.xueyao.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)//指定采用spring的运行器来运行单元测试方法
@ContextConfiguration("classpath:applicationContext.xml") //指定spring配置文件的路径，因为runner需要
public class TestIOC {
    
    @Autowired//按照类型自动注入
    private UserDao userDao;
    
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
    public void test4() {
        userDao.save();
    }
    @Test
    public void test2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        userDao.save();
    }
    
    //PreDestroy
    @Test
    public void test3() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService  userService = (UserService) ac.getBean("userService");
        userService.save();
        ((ClassPathXmlApplicationContext)ac).close();
    }
    
   
}
