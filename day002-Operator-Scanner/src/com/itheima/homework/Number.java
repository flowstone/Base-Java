package com.itheima.homework;

import java.util.Scanner;

/*
 * ������:�����������󣬲��ô���ʵ��
	1.����¼������int���͵�����
	2.Ҫ��
		(1)����������е���Сֵ����ӡ
		(2)����������ĺͲ���ӡ
 */
public class Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������һ������(int����)");
		int a = sc.nextInt();
		
		System.out.println("������ڶ�������(int����)");
		int b = sc.nextInt();
		
		System.out.println("���������������(int����)");
		int c = sc.nextInt();
		
		int min = a > b?b:a;
		min = min > c?c:min;
		System.out.println("�������е���Сֵ��"+min);
		int sum = a + b + c;
		System.out.println("�������ĺ���"+sum);
		
	}
}
