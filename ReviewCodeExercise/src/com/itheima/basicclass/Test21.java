package com.itheima.basicclass;

import java.awt.print.Printable;

/*
 * ����дһ���������ڿ���̨���10��HelloWorld������
 * 
 * ������ȷ��
 * 		����ֵ���ͣ�void
 * 		�����б��޲���
 * 
 * ���һ������û����ȷ�ķ���ֵ���ͣ�java�ṩ��void�������Ρ�
 * 
 * void���εķ����ĵ��ã�
 * 		A:��������
 */
public class Test21 {
	public static void main(String[] args) {
		printHello(10);
	}

    public static void printHello(int i) {
        // TODO Auto-generated method stub
        for (int j = 1; j <= i; j++) {
            System.out.println("HelloWorld");
        }
    }
}
