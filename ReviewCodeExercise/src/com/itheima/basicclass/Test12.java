package com.itheima.basicclass;
/*
 * ���󣺶����������飬�ȶ���һ�����飬��ֵ�������Ȼ����ڶ��������ʱ��ѵ�һ������ĵ�ַ��ֵ���ڶ������顣
 * Ȼ����ڶ������鸳ֵ���ٴ�����������������Ԫ�ء�
 */
public class Test12 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
		for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
		
		int[] arr1 = arr;
		arr1[2] = 10;
		arr1[3] = 30;
		System.out.println(arr);
		System.out.println(arr1);
		for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
	}
}
