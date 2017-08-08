package org.xueyao.proxy.task03;

import java.lang.reflect.Proxy;

/**
 * @author Yao Xue
 * @date Aug 7, 2017 7:15:25 PM
 */
public class Test {
    public static void main(String[] args) {
        Person p = (Person) Proxy.newProxyInstance(Student.class.getClassLoader(), Student.class.getInterfaces(), new MyHandler(new Student()));
        p.work();
    }
}
