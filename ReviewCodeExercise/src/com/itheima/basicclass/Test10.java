package com.itheima.basicclass;
/*
 * ���󣺶���һ�����飬�����������Ԫ�ء�Ȼ��������е�Ԫ�ظ�ֵ���ٴ������������Ԫ�ء�
 */
public class Test10 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
		
		for (int i = 0; i < arr.length; i++) {
            arr[i] = 1 + i;
            System.out.println(arr[i]);
        }
	}
}
