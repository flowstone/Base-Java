package com.itheima.homework.teacher;

import java.util.Scanner;

/*
 * �ڶ��⣺�����������󣬲��ô���ʵ��
	1.����¼��һ�����ַ���,��¼��һ��С�ַ���
	2.ͳ��С�ַ����ڴ��ַ����г��ֵĴ���
	3.�������д�ӡ��ʽ:
		��������ַ���:javajava I love java l like jajavava I enjoy javajavajava
		������С�ַ���:heima
		����̨���:С�ַ���heima,�ڴ��ַ���woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma�й�����3��
		
		woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma
		1:,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma
		2:butongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma
		3:haishibaima,zhaodaogongzuojiushihaoma
 */
public class Test_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ�����ַ���");
		String str = sc.nextLine();
		System.out.println("������һ��С�ַ���");
		String str1 = sc.nextLine();

		/*
		 * ������ȷ ����ֵ���� int �����б� String str,String str1;
		 */

		int count = getNum(str, str1);
		System.out.println(count);
	}

	public static int getNum(String str, String str1) {

		//
		int length;
		int count = 0;
		while ((length = str.indexOf(str1)) >= 0) {
			str = str.substring(length + str1.length());
			count++;
		}
		return count;
	}
}
