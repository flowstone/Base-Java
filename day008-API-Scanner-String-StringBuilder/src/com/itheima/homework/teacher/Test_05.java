package com.itheima.homework.teacher;

import java.util.Random;

/*
 * ������: ������������,���ô���ʵ��
	1.����String getStr(char[] chs)����
		������������ȡ����Ϊ5������ַ������ַ����������4����дӢ����ĸ��1��0-9֮�䣨����0��9�����������
	2.����main��������������ɣ�
		(1)���峤��Ϊ26��Ԫ��ֵΪ26����дӢ����ĸ������chs
		(2)��������chs����getStr(char[] chs)��������ȡ����ֵ,���ڿ���̨��ӡ����ֵ
 */
public class Test_05 {
	public static void main(String[] args) {
		char[] ch = getChar();
		printArray(ch);
		System.out.println(getStr(ch));
	}

	public static void printArray(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();
	}

	public static char[] getChar() {
		char[] ch = new char[26];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) (65 + i);
		}
		return ch;
	}

	// ������������ȡ����Ϊ5������ַ������ַ����������4����дӢ����ĸ��1��0-9֮�䣨����0��9�����������
	public static String getStr(char[] chs) {
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 4; i++) {
			int nextInt = random.nextInt(26);
			sb.append(chs[nextInt]);
		}
		int nextInt = random.nextInt(10);
		sb.insert(random.nextInt(5), nextInt);
		return sb.toString();
	}
	
	//GJGF
}
