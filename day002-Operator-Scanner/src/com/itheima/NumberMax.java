package com.itheima;

import java.util.Scanner;
/*
 * �������������ֵ
 */
public class NumberMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int number1 = sc.nextInt();
		System.out.println("������ڶ�������");
		int number2 = sc.nextInt();
		System.out.println("���������������");
		int number3 = sc.nextInt();

		int max = number1 > number2?number1:number2;
		max = max > number3?max:number3;
		System.out.println("�������֣�"+max);
	}
}
