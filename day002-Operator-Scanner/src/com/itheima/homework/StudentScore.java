package com.itheima.homework;

import java.util.Scanner;

/*
 * ������:�����������󣬲��ô���ʵ��
	1.����¼��һ��ѧ���ɼ�(int����)
	2.�жϸ�ѧ���ɼ��Ƿ񼰸�
	3.��ӡ��ʽ��
		�ɼ�>=60:��ӡ"�ϸ�"
		�ɼ�<60:��ӡ"���ϸ�"
 */
public class StudentScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ��ѧ���ɼ�(int����)");
		int score = sc.nextInt();
		System.out.println(score>=60?"�ϸ�":"���ϸ�");
	}
}
