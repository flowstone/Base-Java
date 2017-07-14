package org.xueyao.day008_05;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 8:04:27 PM
 */
public class Demo_Final {
    public static void main(String[] args) {
        Son son = new Son();
        son.print();
    }
}
/**
 * final概述
 *    final 是最终 的
 * final修饰特点
 *      修饰类，类不能被继承
 *      修饰变量   变量就变成常量，只能被赋值一次
 *      修饰方法， 方法不能被重写
 * 案例演示
 *      final 修饰特点
 */
class Father {
    /*public final void print() {
        System.out.println("访问底层数据资源");
    }*/
    public  void print() {
        System.out.println("访问底层数据资源");
    }
}

class Son extends Father {
    //final int num = 10;
     int num = 10;
     final int NUM = 10;
     public static final double PI = 3.14;
    public void print() {
        //num = 20;
        //System.out.println("哈哈，功能被我干掉");
        System.out.println(num);
    }
}