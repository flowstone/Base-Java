package com.itheima.basicclass;

import java.util.Scanner;

/*
 * ���󣺼���¼���������ݣ������������еĽϴ�ֵ
 * 
 * ������ȷ��
 * 		����ֵ���ͣ�int
 * 		�����б�int a,int b
 */
public class Test18 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("�������һ����");
		int num1 = sc.nextInt();
		System.out.println("������ڶ�����");
		int num2 = sc.nextInt();
		int max = getMax(num1, num2);
		System.out.println("max:"+max);
	}

    public static int getMax(int num1, int num2) {
        // TODO Auto-generated method stub
        return num1 > num2 ? num1 : num2;
    }
}
