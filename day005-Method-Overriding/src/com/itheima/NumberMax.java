package com.itheima;

import java.util.Scanner;

/**
 * 方法练习之获取两个数据中的较大
 * @author Yao Xue
 * @date Jul 1, 2017 11:20:26 AM
 */
public class NumberMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = sc.nextInt();
        System.out.println("请输入第二个数");
        int b = sc.nextInt();
        int max = getMax(a, b);
        System.out.println("两个数据中最大值 "+max);
        
    }
    
    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }
}
