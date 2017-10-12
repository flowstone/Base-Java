package me.xueyao.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.xueyao.domain.Car1;
import me.xueyao.domain.CarInfo;
import me.xueyao.domain.People;



public class Test2DI {

    /**
     * set方法其它注入写法
     */
    @Test
    public void test4() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext5.xml");
        Car1 car1 = (Car1) ac.getBean("car1");
        System.out.println(car1);
    }
    /**
     * 注入其它对象的属性，方法的返回值
     */
    @Test
    public void test5() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext5.xml");
        CarInfo carInfo = (CarInfo) ac.getBean("carInfo");
        System.out.println(carInfo);
    }

}
