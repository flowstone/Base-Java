package com.itheima.basicclass;

import java.util.Scanner;

/*
 * ���󣺼���¼���������ݣ������������е����ֵ
 * 
 * ������ȷ��
 * 		����ֵ���ͣ�int
 * 		�����б�int a,int b,int c
 */
public class Test20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int num1 = sc.nextInt();
		System.out.println("������ڶ�������");
		int num2 = sc.nextInt();
		System.out.println("���������������");
		int num3 = sc.nextInt();
		
		int max = getMax(num1, num2, num3);
		System.out.println("max:"+max);
	}

    public static int getMax(int num1, int num2, int num3) {
        // TODO Auto-generated method stub
        
        if (num1 > num2) {
            if (num1 > num3) {
                return num1;
            } else {
                return num3;
            }
        } else {
            if (num2 > num3) {
                return num2;
            } else {
                return num3;
            }
        }
        
    }
}
