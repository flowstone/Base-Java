package com.itheima;

import java.util.Scanner;
/*
 * 三个数字中最大值
 */
public class NumberMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数字");
		int number1 = sc.nextInt();
		System.out.println("请输入第二个数字");
		int number2 = sc.nextInt();
		System.out.println("请输入第三个数字");
		int number3 = sc.nextInt();

		int max = number1 > number2?number1:number2;
		max = max > number3?max:number3;
		System.out.println("最大的数字："+max);
	}
}
