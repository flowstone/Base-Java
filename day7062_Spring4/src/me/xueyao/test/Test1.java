package me.xueyao.test;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

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
    
    /**
     * 早期版本的Spring工厂：BeanFactory,现已弃用
     */
    @Test
    public void test3() {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("applicationContext.xml"));
        System.out.println("=====工厂对象创建出来了===========");
        UserDao userDao = (UserDao) bf.getBean("userDao");
        userDao.save();
    }
}
