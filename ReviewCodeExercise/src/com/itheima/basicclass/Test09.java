package com.itheima.basicclass;

import java.util.Random;
import java.util.Scanner;

/*
 * ������С��Ϸ����
 *		ϵͳ����һ��1-100֮������������³���������Ƕ��١�
 * ������
 * 		A:ϵͳ����һ�������1-100֮��ġ�
 * 			int number = r.nextInt(100) + 1;
 * 		B:����¼������Ҫ�µ�����
 * 			��Scannerʵ��
 *		C:�Ƚ�����������(��if���)
 *			���ˣ�������ʾ����
 *			С�ˣ�������ʾС��
 *			�����ˣ�������ʾ����ϲ�㣬������
 *		D:��β����ݣ������ǲ�֪��Ҫ�¶��ٴΣ���ô����?
 *			while(true) {ѭ��������}
 */
public class Test09 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Random r = new Random();
	    int number = r.nextInt(100)+1;
		while (true) {
		    System.out.println("��������Ҫ�µ�����");
		    int inputNum = sc.nextInt();
		    if (inputNum > number) {
		        System.out.println("���µ������е����");
		    } else if (inputNum < number) {
		        System.out.println("������������е�С��");
		    } else {
		        System.out.println("��ϲ���¶���");
		        break;
		    }
		}
	}
}
