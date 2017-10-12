package me.xueyao.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.xueyao.domain.Car;

public class TestDI {
    /**
     * 构造方法注入
     */
    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Car car = (Car) ac.getBean("car");
        System.out.println(car);
    }
}
