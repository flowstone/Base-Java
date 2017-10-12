package me.xueyao.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.xueyao.dao.DepartmentDao;

public class Test3 {

    /**
     * 静态工厂方法
     */
    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext3.xml");
        DepartmentDao departmentDao = (DepartmentDao) ac.getBean("departmentDao");
        departmentDao.save();
    }
}
