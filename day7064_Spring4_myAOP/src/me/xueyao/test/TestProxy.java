package me.xueyao.test;

import org.junit.Test;

import me.xueyao.dao.UserDao;
import me.xueyao.dao.impl.DeptDao;
import me.xueyao.dao.impl.UserDaoImpl;
import me.xueyao.proxy.CglibProxy;
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
    
    @Test
    public void test2() {
        //要增强的目标对象
        DeptDao deptDao = new DeptDao();
        CglibProxy proxy = new CglibProxy(deptDao);
        DeptDao createProxy = proxy.createProxy();
        createProxy.save();
        
    }
}
