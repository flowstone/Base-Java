package com.itheima;
/**
 * @author Yao Xue
 * @date Jun 29, 2017 3:12:27 PM
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[2];
        int[] arr1 = arr;
        int[] arr2 = arr;
        
        arr1[0] = 50;
        arr1[1] = 34;
        
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
