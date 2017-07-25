package me.xueyao01.DateDemo;

import java.util.Date;

/**
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
