package com.itheima.homework.teacher;

import java.util.Scanner;

/*
 * ������: ������������,���ô���ʵ��
	1.����¼��һ���ַ���
	2.�����ַ�������ַ�����(����ʹ��toCharArray()����)
	3.���ַ������е����д�д��ĸ���Сд��ĸ(����ʹ��toLowerCase()����)
	4.�����һλ�����һλ�����ݲ���ͬ,�򽻻�
	5.���ַ�����������Ϊż����Ԫ�ر��'~'
	6.��ӡ����Ԫ�ص�����
 */
public class Test_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ַ���");
		String str = sc.nextLine();
		char[] chs = getChar(str);
		char[] newChar = getNewChar(chs);
		printArray(newChar);
		char[] char1 = getChar(chs);
		printArray(char1);
		char[] evenChar = getEvenChar(chs);
		printArray(evenChar);
	}
	
	//�������
	private static void printArray(char[] chs) {
		for (int i = 0; i < chs.length; i++) {
			System.out.print(chs[i]);
		}
		System.out.println();
	}
	//�����ַ�������ַ�����(����ʹ��toCharArray()����)
		/*
		 * ����ֵ���� 	char[]
		 * �����б�	String str
		 */
	public static char[] getChar(String str){
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		return ch;
	}
	
	//3.���ַ������е����д�д��ĸ���Сд��ĸ(����ʹ��toLowerCase()����)'A'  65   'a'  97   97 - 65 = 32
	
	/*
	 * ����ֵ����	char[]
	 * �����б�	char[] chs
	 */
	
	public static char[] getNewChar(char[] chs){
		for (int i = 0; i < chs.length; i++) {
			if ( 'A'  <= chs[i] && chs[i]<= 'Z') {
				chs[i] = (char) (chs[i] + 32);
			}
		}
		return chs;
	}
	
	
	//�����һλ�����һλ�����ݲ���ͬ,�򽻻�
	/*	����ֵ����	char[]
	 * 	�����б�char[] chs
	 */
	public static char[] getChar(char[] chs){
		char temp = 0;
		if (chs[0] != chs[chs.length - 1] ) {
			temp = chs[0];
			chs[0] = chs[chs.length - 1];
			chs[chs.length - 1] = temp;
		}
		return chs;
	}
	
	//5.���ַ�����������Ϊż����Ԫ�ر��'~'
	
	/*	
	 * 	����ֵ����	char[]
	 * 	�����б�char[] chs
	 */
	public static char[] getEvenChar(char[] chs){
		for (int i = 0; i < chs.length; i++) {
			if (i % 2 == 0) {
				chs[i] = '~';
			}
		}
		return chs;
	}
	
}








