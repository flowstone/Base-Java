package com.itheima;

public class OperatorTest {
	public static void main(String[] args) {
		/*
		 * int a = 10;
		 * int b = 20;
		 * int c = 30;  ����������Сֵ 
		 */
		int a = 10;
		int b = 20;
		int c = 30;
		int temp = a<b?a:b;
		int min = temp<c?temp:c;
		System.out.println("��Сֵ��"+min);
		
		/*
		 * int x = 3;
		 * int y = 5;
		 * ������������ֵ��ʹx=5,y=3;
		 */
		/*int x = 3;
		int y = 5;
		int temp2 = x;
		 x = y;
		 y = temp2;
		 
		 System.out.println("x="+x+",y="+y);*/
		
		
	}
}
