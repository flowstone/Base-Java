package com.itheima.basicclass;
/*
 * �������1-100֮��ż����
 * 
 * ������
 * 		A:������ͱ�������ʼ��ֵ��0
 * 		B:��ȡ1-100֮������ݣ���forѭ��ʵ��
 * 		C:�ѻ�ȡ�������ݽ����жϣ����Ƿ���ż��
 * 			����ǣ����ۼ�
 * 		D:�����ͽ��
 */
public class Test05 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
		System.out.println("sum:"+sum);
	}
}
