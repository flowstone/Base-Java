package com.itheima.basicclass;
/*
 * ���󣺶����������飬�ֱ������������Ԫ�ء�Ȼ��ֱ�������е�Ԫ�ظ�ֵ���ֱ��ٴ������������Ԫ�ء�
 */
public class Test11 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] arr1 = new int[10];
		System.out.println(arr);
		for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
		System.out.println(arr1);
		for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
		
		for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
		for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i+1;
        }
		
		System.out.println(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr1);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
	}
}
