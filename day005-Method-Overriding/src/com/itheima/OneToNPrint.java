package com.itheima;

import java.util.Scanner;

/**
 * 打印1到n之间的数据
 * @author Yao Xue
 * @date Jul 1, 2017 12:30:19 PM
 */
public class OneToNPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("请输入n的值");
        int n = sc.nextInt();
        printN(n);
    }
    
    public static void printN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
