package com.itheima;

import java.util.Scanner;

/**
 * ��ӡ1��n֮�������
 * @author Yao Xue
 * @date Jul 1, 2017 12:30:19 PM
 */
public class OneToNPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("������n��ֵ");
        int n = sc.nextInt();
        printN(n);
    }
    
    public static void printN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
