package me.xueyao01.DateDemo;

import java.util.Date;

/**
 *  ##一.Date类
    1. 构造方法
        1. new Date（）输出操作系统时间
            1. Mon Jul 03 08:30:00 CST 2017
            2. CST：china standard time
        3. new Date（long time）毫秒
            1. 传入毫秒值转换成日期
            2. 时间原点  1970年1月1日，0时分秒（java出于unix系统，诞生）
            3. 传0，北京时间8点，因为格林威治时间是0点，北京在东八区
    2. Date的方法
        1. getTime 返回当前日期表示的毫秒值
        2. setTime 传递毫秒值，设置当前时间
    3. 学习重点：掌握日期和毫秒之间的转换，毫秒值可以用于运算
 * @author Yao Xue
 * @date Jul 25, 2017 2:59:03 PM
 */
public class DateDemo {
    public static void main(String[] args) {
        method();
        method2();
        method3();
    }

    private static void method3() {
        // TODO Auto-generated method stub
        Date date = new Date();
        date.setTime(0);
        System.out.println(date);
    }

    private static void method2() {
        // TODO Auto-generated method stub
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }

    private static void method() {
        // TODO Auto-generated method stub
        //输出的是系统的时间
        Date date = new Date();
        System.out.println(date);
        
        //参数：毫秒值，从1970
        Date date2 = new Date(0);
        System.out.println(date2);
    }
}
