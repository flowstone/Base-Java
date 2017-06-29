package org.xueyao.scanner;

import java.util.Scanner;
/*
 * 键盘录入两个数据，比较这两个数据是否相等
 */
public class ScannerTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个数据");
		int num2 = sc.nextInt();
		String c = (num1 == num2)?"相等":"不相等";
		System.out.println(num1+"与"+num2+c);
	}
}
