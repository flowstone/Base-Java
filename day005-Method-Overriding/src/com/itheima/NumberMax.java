package com.itheima;

import java.util.Scanner;

/**
 * ������ϰ֮��ȡ���������еĽϴ�
 * @author Yao Xue
 * @date Jul 1, 2017 11:20:26 AM
 */
public class NumberMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ����");
        int a = sc.nextInt();
        System.out.println("������ڶ�����");
        int b = sc.nextInt();
        int max = getMax(a, b);
        System.out.println("�������������ֵ "+max);
        
    }
    
    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }
}
