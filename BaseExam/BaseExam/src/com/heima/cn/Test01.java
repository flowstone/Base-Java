package com.heima.cn;
/*
 * javaEE13��   89��  ѦҢ
 * 1 . 
main�����ж���3��������int a = 5, b = 3, c = 8;
�������������Ҫ��
  1). ����if������a��b��c������������ӡ������̨�ϣ�
  2).  ������Ԫ��������a��b��c����С��������ӡ������̨�ϣ�
         (20��)
 */
public class Test01 {
	public static void main(String[] args) {
		int a = 5, b = 3, c = 8;
		int max =0;
		if (a > b ) {
			max = a;
		} else {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		
		System.out.println("max:"+max);
		int min = a < b ? a : b;
		min = min < c ? min : c;
		System.out.println("min:"+min);
	}
}
