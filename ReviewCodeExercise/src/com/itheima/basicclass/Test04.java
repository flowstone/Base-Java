package com.itheima.basicclass;
/*
 * �������1-5֮������֮��
 * 
 * ������
 * 		A:������ͱ�������ʼ��ֵ��0
 * 		B:��ȡ1-5֮������ݣ���forѭ��ʵ��
 * 		C:��ÿһ�λ�ȡ�������ݣ��ۼ������Ϳ�����
 * 		D:�����ͱ�������
 */
public class Test04 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
            sum += i;
        }
		
		System.out.println("sum:"+sum);
	}
}
