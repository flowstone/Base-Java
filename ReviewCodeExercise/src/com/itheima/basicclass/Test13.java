package com.itheima.basicclass;
/*
 * 需求：数组遍历(依次输出数组中的每一个元素)
 * 获取数组中元素的个数：数组名.length
 */
public class Test13 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
	}
}
