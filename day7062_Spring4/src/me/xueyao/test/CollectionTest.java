package me.xueyao.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import me.xueyao.domain.CollectionBean;

public class CollectionTest {
    
    /**
     * Array和list集合注入(重点)
     */
    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext6.xml");
        CollectionBean cb = (CollectionBean) ac.getBean("collectionBean");
        System.out.println(cb);
    }
}
