package org.xueyao.reflect.work01;

import java.lang.reflect.Method;

/**
 * 一、编写一个类，增加一个实例方法用于打印一条字符串。
并使用反射手段创建该类的对象， 并调用该对象中的方法

 * @author Yao Xue
 * @date Aug 6, 2017 9:16:41 PM
 */
public class Task02 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("org.xueyao.reflect.work01.Person");
        
        Person p = (Person) clazz.newInstance();
        
        Method method = clazz.getMethod("say");
        Object invoke = method.invoke(p);
        System.out.println(invoke);
        
    }
}
