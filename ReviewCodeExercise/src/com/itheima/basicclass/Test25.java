package com.itheima.basicclass;
/*
 * 需求：把遍历数组改进为方法实现，并调用方法
 */
public class Test25 {
	public static void main(String[] args) {
	    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		printArray(arr);
	}

    public static void printArray(int[] arr) {
        // TODO Auto-generated method stub
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]+"]");
            } else {
                System.out.print(arr[i]+", ");
            }
        }
    }
}
