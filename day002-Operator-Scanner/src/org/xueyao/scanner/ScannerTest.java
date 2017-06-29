package org.xueyao.scanner;

import java.util.Scanner;
/*
 * 键盘录入两个数据，并对两个数据求和，输出结果 
 */
public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据");
		int a = sc.nextInt();
		System.out.println("请输入第二个数据");
		int b = sc.nextInt();
		System.out.println(a+" + "+b+" = "+(a+b));
	}
}
