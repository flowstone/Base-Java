package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * ����¼���ĸ���������ȡ���ĸ���������������ӡ��[Ҫ��ʹ��if���]
��ʾ�������ȽϵĽ���ٱȽ�һ��

 */
public class IfFourNumberMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ������");
        int number1 = sc.nextInt();
        System.out.println("������ڶ�������");
        int number2 = sc.nextInt();
        System.out.println("���������������");
        int number3 = sc.nextInt();
        System.out.println("��������ĸ�����");
        int number4 = sc.nextInt();
        
        int max1 = 0;
        //ǰ�������ݱȽ�
        if (number1 > number2) {
            max1 = number1;
        } else {
            max1 = number2;
        }
        
        int max2 = 0;
        //���������ݱȽ�
        if (number3 > number4) {
            max2 = number3;
        } else {
            max2 = number4;
        }
        
        int max = 0;
        //���αȽϺ����ֵ֮��ıȽ�
        if (max1 > max2) {
            max = max1;
        } else {
            max = max2;
        }
        
        System.out.println("�ĸ���������������"+max);
    }
}
