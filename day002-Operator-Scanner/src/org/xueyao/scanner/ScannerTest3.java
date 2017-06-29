package org.xueyao.scanner;
import java.util.Scanner;
/*
 * 键盘录入三个数据，获取这三个数据中的最大值
 */
public class ScannerTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int temp = a>b?a:b;
		int max = temp>c?temp:c;
		System.out.println(a+","+b+","+c+"中最大值是"+max);
	}
}
