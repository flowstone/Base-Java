package org.xueyao.scanner;

import java.util.Scanner;
/*
 * ����¼���������ݣ��Ƚ������������Ƿ����
 */
public class ScannerTest2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������");
		int num1 = sc.nextInt();
		System.out.println("������ڶ�������");
		int num2 = sc.nextInt();
		String c = (num1 == num2)?"���":"�����";
		System.out.println(num1+"��"+num2+c);
	}
}
