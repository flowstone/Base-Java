package com.itheima.homework;

import java.util.Scanner;

/*
 * 第四题:分析以下需求，并用代码实现
	1.键盘录入三个int类型的数字
	2.要求：
		(1)求出三个数中的最小值并打印
		(2)求出三个数的和并打印
 */
public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数字(int类型)");
		int a = sc.nextInt();
		
		System.out.println("请输入第二个数字(int类型)");
		int b = sc.nextInt();
		
		System.out.println("请输入第三个数字(int类型)");
		int c = sc.nextInt();
		
		int min = a > b?b:a;
		min = min > c?c:min;
		System.out.println("三个数中的最小值是"+min);
		int sum = a + b + c;
		System.out.println("三个数的和是"+sum);
		
	}
}
