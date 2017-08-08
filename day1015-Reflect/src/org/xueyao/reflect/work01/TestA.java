package org.xueyao.reflect.work01;

import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * 一、编写一个类A，增加一个实例方法showString,用于打印一条字符串，
在编写一个类TestA ,作为客户端，用键盘输入一个字符串，该字符串就是类A的全名，使用反射机制创建该类的对象，
并调用该对象中的方法showString

 * @author Yao Xue
 * @date Aug 6, 2017 9:30:29 PM
 */
public class TestA {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入一个字符串");
        String inputString = sc.nextLine();
        
        Class clazz = Class.forName(inputString);
        A a = (A) clazz.newInstance();
        Method method = clazz.getMethod("showString", null);
        Object invoke = method.invoke(a, null);
        System.out.println(invoke);
    }
}
