package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * �����⣺�����������󣬲��ô���ʵ�֣�
    1.����¼���������������մ�С�����˳�����
    2.����û��������3 2 1���������к��ӡ��ʽ"���մ�С����������˳��Ϊ��1 2 3"
    5 2 3
    2 3 5
 */
public class HomeWork_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ����");
        int number1 = sc.nextInt();
        System.out.println("������ڶ�����");
        int number2 = sc.nextInt();
        System.out.println("�������������");
        int number3 = sc.nextInt();
        /* ����һ
        int temp =number1 > number2 ? number1 : number2;
        int max = temp > number3 ? temp : number3;
        
        temp = number1 < number2 ? number1 : number2;
        int min = temp < number3 ? temp : number3;
        int sum = number1 + number2 + number3;
        System.out.println("���մ�С����������˳��Ϊ��"+min+" "+(sum-max-min)+" "+max);
        */
        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number1 > number3) {
            int temp = number1;
            number1 = number3;
            number3 = temp;
        }
        if (number2 > number3) {
            int temp = number2;
            number2 = number3;
            number3 = temp;
        }
       
        System.out.println("���մ�С����������˳��Ϊ��"+number1+", "+number2+", "+number3);
        
    }
}
