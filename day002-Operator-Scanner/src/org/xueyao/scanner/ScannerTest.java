package org.xueyao.scanner;

import java.util.Scanner;
/*
 * ����¼���������ݣ���������������ͣ������� 
 */
public class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int a = sc.nextInt();
		System.out.println("������ڶ�������");
		int b = sc.nextInt();
		System.out.println(a+" + "+b+" = "+(a+b));
	}
}
