package com.itheima.basicclass;

import java.util.Scanner;

/*
 * ����¼��ѧ�����Գɼ�������ݳɼ��жϸ�ѧ�������ĸ�����
 * 90-100	����
 * 80-90	��
 * 70-80	��
 * 60-70	����
 * 60����	������
 * 
 * ������
 * 		A:����¼��ѧ�����Գɼ�
 * 			������
 * 		B:ͨ���򵥵ķ��������Ǿ�������if����ʽ3��ʵ��
 * 
 * ����һ��Ҫ������ȫ�ˡ�
 * 		��ȫ����
 * 		�߽�����
 * 		��������
 */
public class Test02 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("������ѧ�����Գɼ���");
		int score = sc.nextInt();
	    if (score < 0 || score > 100) {
	        System.out.println("���������ݷǷ�");
        } else {
            switch (score/10) {
            case 10:
            case 9:
                System.out.println("����");
                break;
            case 8:
                System.out.println("��");
                break;
            case 7:
                System.out.println("��");
                break;
            case 6:
                System.out.println("����");
                break;
            default:
                System.out.println("������");
                break;
            }
        }
	}
}
