package com.itheima;

import java.util.Scanner;

/**
 * ������ϰ֮�Ƚ����������Ƿ����
 * @author Yao Xue
 * @date Jul 1, 2017 11:32:06 AM
 */
public class NumberEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ����");
        int num1 = sc.nextInt();
        System.out.println("������ڶ�����");
        int num2 = sc.nextInt();
        String equal = getEqual(num1, num2);
        System.out.println(num1+"��"+num2+equal);
    }
    
    public static String getEqual(int num1, int num2) {
        return num1 == num2 ? "���" : "�����";
    }
}
