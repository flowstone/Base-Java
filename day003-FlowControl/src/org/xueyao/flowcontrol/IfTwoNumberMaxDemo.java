package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * �����������������Ƚ�����������
 */
public class IfTwoNumberMaxDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ������");
        int number1 = sc.nextInt();
        System.out.println("������ڶ�������");
        int number2 = sc.nextInt();
        
        int max = 0;
        if (number1 > number2) {
            max = number1;
        } else {
            max = number2;
        }
        
        System.out.println("��������������"+max);
        
    }
}
