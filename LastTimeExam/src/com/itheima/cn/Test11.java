package com.itheima.cn;

import java.util.Scanner;

/**
 * ������������ѽ������Ӧ���ۿۣ��������ۿ��ڿ���̨�����Ӧ�ۿۺ�Ľ��ۿ۵ķ�Χ���£�P�������ѵĽ��� 
P>=2000 7�ۣ�1000<=P<2000 8�ۣ�500<=P<1000 9.5�ۣ�P<500 ������ 
   
 * @author Yao Xue
 * @date Jul 9, 2017 4:42:13 PM
 */
public class Test11 {
    public static void main(String[] args) {
        /**
         * ������
         *      �Ӽ������������ۿ�
         *      ����ۿۺ���
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("�����������ѽ�");
        int money = sc.nextInt();
        double sale;
        if (money >= 2000) {
            sale = 0.7;
            System.out.println("��7��");
        } else if (money >= 1000 && money < 2000) {
            sale = 0.8;
            System.out.println("��8��");
        } else if (money >= 500 && money < 1000) {
            sale = 0.95;
            System.out.println("��9.5��");
        } else {
            sale = 1;
            System.out.println("������");
        }
        
        money *= sale;
        
        System.out.println("�ۿۺ�Ľ��"+money);
    }
}