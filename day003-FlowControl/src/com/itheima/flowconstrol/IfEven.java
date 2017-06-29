package com.itheima.flowconstrol;


import java.util.Scanner;
/*
 * 判断输入的数据是否是偶数，如果是奇数不输出,偶数则输出
 */
public class IfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("请输入一个整数 ");
        int number = sc.nextInt();
        
        if (number % 2 == 0) {
            System.out.println(number+"是一个偶数");
        }
        
    }
}
