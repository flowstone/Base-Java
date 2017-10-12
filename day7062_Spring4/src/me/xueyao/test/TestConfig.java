package me.xueyao.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.xueyao.dao.UserDao;

public class TestConfig {
   
   /**
    * 比较scope属性，singleton单例创建两个对象是否相同
    */
   @Test
   public void testSingleton() {
       //读取Spring配置文件
       ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2");
       System.out.println("对象创建出来 了");
       UserDao userDao = (UserDao) ac.getBean("userDao");
       UserDao userDao1  = (UserDao) ac.getBean("userDao");
       
       System.out.println(userDao == userDao1);
       userDao.save();
   }
   
   /**
    * prototype 多例，每次生成的对象不相同
    */
   @Test
   public void testPrototype() {
       ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");
       System.out.println("对象创建出来了");
       UserDao userDao = (UserDao) ac.getBean("userDao");
       UserDao userDao1 = (UserDao) ac.getBean("userDao");
       System.out.println(userDao == userDao1);
       userDao.save();
   }
   /**
    * init-method
    */
   @Test
   public void testInit() {
       ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");
       System.out.println("工厂对象创建出来了");
       UserDao userDao = (UserDao) ac.getBean("userDao");
       userDao.save();
   }
   
   /**
    * destroy-method
    */
   @Test
   public void testDestroy() {
       ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");
       System.out.println("工厂对象创建出来了");
       UserDao userDao = (UserDao) ac.getBean("userDao");
       userDao.save();
       
       ((ClassPathXmlApplicationContext)ac).close();
   }
}
