package com.itheima.homework.teacher;

import java.util.Scanner;

/*
 * ������: ������������,���ô���ʵ��
	1.����¼��һ��Դ�ַ������ַ�������scrStr����
	2.����¼��һ��Ҫɾ�����ַ������ַ�������delStr����
	3.Ҫ��
		ɾ������scrStr�����е�����delStr�ַ��������յ��ַ����в��ܰ���delStr����Ҫ���ӡɾ����Ľ���Լ�ɾ���˼���delStr�ַ���
	4.�������д�ӡ��ʽ:
		������Դ�ַ���:java woaijava,i like jajavava i enjoy java
		������Ҫɾ�����ַ���:java
		����̨������:Դ�ַ������ܹ�����:5 �� java ɾ��java����ַ���Ϊ: woai,i like  i enjoy
		
		
		java woaijava,i like jajavava i enjoy java
		1: woaijava,i like jajavava i enjoy java
		2:woai������,i like jajavava i enjoy java��������woai,i like jajavava i enjoy java
		3��woai,i like ja������va i enjoy java��������woai,i like java i enjoy java
		4��woai,i like ������ i enjoy java��������woai,i like  i enjoy java
		5��woai,i like  i enjoy ������""��������woai,i like  i enjoy 
		
		
 */
public class Test_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����ַ���");
		String str = sc.nextLine();
		System.out.println("������һ��С�ַ���");
		String str1 = sc.nextLine();
		getNum(str, str1);
	}
	
	
	public static void getNum(String str, String str1) {
		int length;
		int count = 0;
		while ((length = str.indexOf(str1)) >= 0) {
			StringBuilder sb = new StringBuilder();
			sb.append(str.substring(0, length));
			sb.append(str.substring(length + str1.length()));
			str = sb.toString();
			count++;
		}
		System.out.println("Դ�ַ������ܹ�����:"+count+" �� java ɾ��java����ַ���Ϊ:"+str);
	}
}
