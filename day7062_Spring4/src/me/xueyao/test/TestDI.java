package me.xueyao.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.xueyao.domain.Car;
import me.xueyao.domain.Car1;
import me.xueyao.domain.CarInfo;
import me.xueyao.domain.People;
import me.xueyao.domain.Student;

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
    /**
     * set方法注入
     */
    @Test
    public void test2() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext4.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student);
    }
    
    /**
     * set方法注入对象
     */
    @Test
    public void test3() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext4.xml");
        People people = (People) ac.getBean("people");
        System.out.println(people);
    }
    
    
}
