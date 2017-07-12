package com.itheima.cn;

import java.util.Scanner;

/**
 * 根据输入的消费金额，输出对应的折扣，并根据折扣在控制台输出对应折扣后的金额，折扣的范围如下（P代表消费的金额）： 
P>=2000 7折，1000<=P<2000 8折，500<=P<1000 9.5折，P<500 不打折 
   
 * @author Yao Xue
 * @date Jul 9, 2017 4:42:13 PM
 */
public class Test11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入消费金额");
        int price = sc.nextInt();
        double sale;
        if (price >= 2000) {
            sale = 0.7;
            System.out.println("打7折");
        } else if (price >=1000 && price < 2000) {
            sale = 0.8;
            System.out.println("打8折");
        } else if (price >= 500 && price < 1000) {
            sale = 0.95;
            System.out.println("打9.5折");
        } else {
            sale = 1;
            System.out.println("不打折");
        }
        price *= sale;
        System.out.println("折扣后金额："+price);
    }
}
