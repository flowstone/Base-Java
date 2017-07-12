package com.itheima.cn;

import java.util.Scanner;

/**
 * 自定义一个四舍五入的方法，提示用户输入一个double类型的小数，传入该方法中；通过判断小数点后第一位数字的大小返回四舍五入后的整数；
    PS： 不能使用Math类相关方法
 * @author Yao Xue
 * @date Jul 9, 2017 8:46:13 AM
 */
public class Test09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入了一个double类型的小数");
        
        double number = sc.nextDouble();
        int lastNumber = (int) (number + 0.5);
        System.out.println("四舍五入："+lastNumber);
    }
}
