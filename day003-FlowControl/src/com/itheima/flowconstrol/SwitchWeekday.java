package com.itheima.flowconstrol;

import java.util.Scanner;
/*
 * ����1-7֮�����ֵ
 * ʹ��switch����ж������Ӧ������
 */
public class SwitchWeekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������1-7֮�������");
        int weekday = sc.nextInt();
        
        if (weekday < 1 || weekday > 7) {
            System.out.println("������ķǷ����ݣ�����������");
        } else {
            switch (weekday) {
            case 1:
                System.out.println("����һ");
                break;
            case 2:
                System.out.println("���ڶ�");
                break;
            case 3:
                System.out.println("������");
                break;
            case 4:
                System.out.println("������");
                break;
            case 5:
                System.out.println("������");
                break;
            case 6:
                System.out.println("������");
                break;
            default:
                System.out.println("������");
                break;
            }
        }
    }
}
