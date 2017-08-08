package me.xueyao.jdk;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Yao Xue
 * @date Aug 7, 2017 5:00:03 PM
 */
public class JunitDemo {
    @Before
    public void test_Before() {
        System.out.println("Before注解的方法...");
    }
    
    @After
    public void test_After() {
        System.out.println("After注解的方法...");
    }
    
    @Test
    public void test01() {
        System.out.println("测试test01方法...");
    }
    
    @Test
    public void test_02() {
        System.out.println("测试test02方法...");
    }
    
    @Test
    public void test_03() {
        System.out.println("测试test03方法...");
    }
}
