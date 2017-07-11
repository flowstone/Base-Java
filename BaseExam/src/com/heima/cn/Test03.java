package com.heima.cn;
/*
 * 3 . 
定义一个整数数组，包含元素{1,3,4,7,8}，获取数组中数组角标和对应的元素都为偶数的元素与个数，并在控制台打印输出。
 */
public class Test03 {
	public static void main(String[] args) {
		int[] arr = {1,3,4,7,8};
		int count = 0;
		for (int i = 0; i < arr.length; i=i+2) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println("个数为"+count);
	}
}
