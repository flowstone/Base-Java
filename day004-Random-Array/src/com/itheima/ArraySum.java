package com.itheima;
/**
 * @author Yao Xue
 * @date Jun 29, 2017 11:56:31 AM
 */
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = new int[6];
        
        arr[0] = 65;
        arr[1] = 55;
        arr[2] = 45;
        arr[3] = 35;
        arr[4] = 25;
        arr[5] = 15;
        
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("sum:"+sum);
    }
}
