package com.itheima.flowconstrol;


import java.util.Scanner;
/*
 * �ж�����������Ƿ���ż������������������,ż�������
 */
public class IfEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("������һ������ ");
        int number = sc.nextInt();
        
        if (number % 2 == 0) {
            System.out.println(number+"��һ��ż��");
        }
        
    }
}
