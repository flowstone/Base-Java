package com.itheima.basicclass;
/*
 * ����ͳ�ơ�ˮ�ɻ��������ж��ٸ�
 * 
 * ������
 * 		A:����ͳ�Ʊ�������ʼ��ֵ��0
 * 		B:��ȡ��λ������forѭ��ʵ��
 * 		C:��ȡ��λ���ĸ�λ��ʮλ����λ
 * 		D:�ж������λ���Ƿ���ˮ�ɻ���������ǣ�ͳ�Ʊ���++
 * 		E:���ͳ�ƽ���Ϳ�����
 */
public class Test07 {
	public static void main(String[] args) {
	    int count = 0;
	    for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            if (ge*ge*ge+shi*shi*shi+bai*bai*bai == i) {
                System.out.println(i);
                count++;
            }
        }
	    System.out.println("ˮ�ɻ�����"+count);
	}
}
