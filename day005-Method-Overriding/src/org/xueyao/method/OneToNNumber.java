package org.xueyao.method;

import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jun 29, 2017 7:55:27 PM
 */
public class OneToNNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数(大于1)");
        int n = sc.nextInt();
        printNumber(n);
    }
    
    public static void printNumber(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
