package me.xueyao.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import me.xueyao.dao.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestAOP {
    
    @Autowired
    private UserDao userDao;
    
    @Test
    public void test1() {
        userDao.save();
    }
    
    @Test
    public void test2() {
        userDao.delete();
    }
    
    @Test
    public void test3() {
        userDao.update();
    }
    
    @Test
    public void test4() {
        userDao.list();
    }
}
