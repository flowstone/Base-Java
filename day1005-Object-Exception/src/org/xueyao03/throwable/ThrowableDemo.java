package org.xueyao03.throwable;
/**
 *  Throwable : 可抛出的
 * 1. 异常的继承体系
        1. 异常的介绍：也是一个类（java面向对象），java.lang.Throwable 是java中所有异常和错误的父类，有两个子类 
            1. Error（错误）：所有错误的父类，非常严重，不修改源代码，不能执行
                1. 无法解决,只能避开(修改代码)
                2. 人:癌症  艾滋  非典
            2. Exception（异常）：Exception类表示程序可以处理的异常，可以捕获且可能恢复。

        2. 因为Error是无法处理只能修改源码（虚拟机相关的问题：系统崩溃，虚拟机错误，内存空间不足，方法调用栈溢），所以开发中主要是Exception
 * @author Yao Xue
 * @date Jul 24, 2017 2:15:32 PM
 */
public class ThrowableDemo {
    public static void main(String[] args) {
       Person p = new Person();
       p.speak();
       
       //java.lang.ArrayIndexOutOfBoundsException 数组越界异常
       int[] array = {1, 2, 3};
       System.out.println(array[3]);
    }
}


class Person {
    //java.lang.StackOverflowError 栈溢出错误，主要原因，方法无限递归调用
    //无法解决，只能避开(栈内存空间有固定大小)
    void speak() {
        //speak();
    }
}