package com.itheima;

import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 2, 2017 10:58:01 AM
 */
public class MethodSumDebug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("�������һ����");
        int a = sc.nextInt();
        System.out.println("������ڶ�����");
        int b = sc.nextInt();
        sc.close();
        int sum = getSum(a,b);
        System.out.println("�������ĺ�"+sum);
    }

    public static int getSum(int a, int b) {
        return a + b;
    }
}
