package me.xueyao.classloader;

import org.junit.Test;

/**
 * @author Yao Xue
 * @date Aug 7, 2017 6:11:52 PM
 */
public class ClassDemo {
    @Test
    public void demo01() throws Exception {
        Class<?> cls = Class.forName("me.xueyao.classloader.ClassDemo");
        System.out.println(cls);  //class me.xueyao.classloader.ClassDemo
    }
    
    @Test
    public void demo02() {
        Class<?> cls = String.class;
        System.out.println(cls); //class java.lang.String

    }
    
    @Test
    public void demo03() {
        Object obj = new String();
        Class<?> cls = obj.getClass();
        System.out.println(cls); //class java.lang.String

    }
}
