package com.itheima.basicclass;

import java.util.Scanner;

/*
 * ���󣺼���¼���������ݣ��Ƚ��������Ƿ����
 * 
 * ������ȷ��
 * 		����ֵ���ͣ�boolean
 * 		�����б�int a,int b
 */
public class Test19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int num1 = sc.nextInt();
		System.out.println("������ڶ�������");
		int num2 = sc.nextInt();
		
		boolean equal = getEqual(num1, num2);
		if (equal) {
            System.out.println("�����������");
        } else {
            System.out.println("�������ݲ����");
        }
	}

    public static boolean getEqual(int num1, int num2) {
        // TODO Auto-generated method stub
        
        return num1 == num2;
    }
}
