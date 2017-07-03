package com.itheima.basicclass;
/*
 * 需求：把获取数组最值改进为方法实现，并调用方法
 */
public class Test26 {
	public static void main(String[] args) {
	    int[] arr = {2, 2, 3, 1, 5, 6, 7, 8, 9, 10};
	    arr = getNum(arr);
	    System.out.println("最大值是："+arr[0]);
	    System.out.println("最小值是："+arr[1]);
	}

    public static int[] getNum(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            arr[0] = max;
            arr[i] = min;
        }
       
        return arr;
    }
}
