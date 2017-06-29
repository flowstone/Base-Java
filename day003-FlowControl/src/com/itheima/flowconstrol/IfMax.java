package com.itheima.flowconstrol;

import java.util.Scanner;

public class IfMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数据");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数据");
        int number2 = sc.nextInt();
        
        if (number1 > number2) {
            System.out.println("两个数据中最大的是"+number1);
        } else {
            System.out.println("两个数据中最大的是"+number2);
        }
    }
}
