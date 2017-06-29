package com.itheima;

public class OperatorTest {
	public static void main(String[] args) {
		/*
		 * int a = 10;
		 * int b = 20;
		 * int c = 30;  求三个数最小值 
		 */
		int a = 10;
		int b = 20;
		int c = 30;
		int temp = a<b?a:b;
		int min = temp<c?temp:c;
		System.out.println("最小值："+min);
		
		/*
		 * int x = 3;
		 * int y = 5;
		 * 交换两个数的值，使x=5,y=3;
		 */
		/*int x = 3;
		int y = 5;
		int temp2 = x;
		 x = y;
		 y = temp2;
		 
		 System.out.println("x="+x+",y="+y);*/
		
		
	}
}
