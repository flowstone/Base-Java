package com.itheima;
/**
 * @author Yao Xue
 * @date Jun 29, 2017 3:30:35 PM
 */
public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {5, 2, 6, 8, 89, 32};
        
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("数组中最大的数是   "+max);
    }
}
