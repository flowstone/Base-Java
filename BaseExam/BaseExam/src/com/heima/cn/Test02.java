package com.heima.cn;

import java.util.Scanner;

/*
 * 2 . ģ��ע���û�����������Ҫ��ʵ����ع��ܣ�
    a.	��ʾ�û��ڿ���̨�����ֻ����룬�����ա�	  
    b.	�жϸ��ֻ������Ƿ���11λ���Ƿ������֣�������Բ����жϣ��������������һ�����ʾ�û���ע���û�ʧ�ܡ���
    c.	���ֻ��ŵĺ���λ��ȡ�������������̨�ϡ�  
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ���ֻ�����");
		String number = sc.nextLine();
		boolean flag = false;
		if (number.length() == 11) {
			char[] ch = number.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] <'0' ||ch[i] >'9') {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("ע���û�ʧ��");
			} else {
				System.out.println("�ֻ�����λ��"+ number.substring(7,11));
			}
		} else {
			System.out.println("ע���û�ʧ��");
		}
		
		
		
	}
}
