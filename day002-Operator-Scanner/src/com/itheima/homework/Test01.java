package com.itheima.homework;

import java.util.Scanner;

/*
 * ��һ��:�����������󣬲��ô���ʵ��
	1.����¼��һ����λ����������ֱ��ȡ����λ����ÿһλ����ֵ
	2.���磺����¼�������123�ĸ�λ��ʮλ����λ���ֱ���3��2��1
	3.��ӡ��ʽ:"����123�ĸ�λ�� 3, ʮλ�� 2, ��λ�� 1"
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����λ����");
		int num = sc.nextInt();
		int ge = num %10;
		int shi = num/10%10;
		int bai = num/100%10;
		System.out.println("����"+num+"�ĸ�λ��"+ge+", ʮλ�� "+shi+", ��λ��"+bai);
		
	}
}
