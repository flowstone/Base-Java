package me.xueyao.test;

import org.junit.Test;

import me.xueyao.dao.UserDao;
import me.xueyao.dao.impl.UserDaoImpl;
import me.xueyao.proxy.JdkProxy;

public class TestProxy {
    
    @Test
    public void test1() {
        //要增强的目标对象
        UserDao userDao = new UserDaoImpl();
        JdkProxy jdkProxy = new JdkProxy(userDao);
        UserDao proxy = jdkProxy.createProxy();
        proxy.save();
    }
}
