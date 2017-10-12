package me.xueyao.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import me.xueyao.dao.UserDao;

public class Test1 {
    
    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        userDao.save();
    }
    
    @Test
    public void test2() {
        ApplicationContext ac = new FileSystemXmlApplicationContext("F:/Code/applicationContext.xml");
        UserDao userDao = (UserDao) ac.getBean("userDao");
        userDao.save();
    }
}
