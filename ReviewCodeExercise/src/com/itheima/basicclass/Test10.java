package com.itheima.basicclass;
/*
 * 需求：定义一个数组，输出数组名及元素。然后给数组中的元素赋值，再次输出数组名及元素。
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
