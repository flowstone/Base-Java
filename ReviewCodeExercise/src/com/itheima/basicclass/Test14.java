package com.itheima.basicclass;
/*
 * ���������ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)
 */
public class Test14 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 2;
        }
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
		
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}
}
