package com.itheima.basicclass;
/*
 * 需求：定义两个数组，先定义一个数组，赋值，输出。然后定义第二个数组的时候把第一个数组的地址赋值给第二个数组。
 * 然后给第二个数组赋值，再次输出两个数组的名及元素。
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
