package com.itheima;
/**
 * @author Yao Xue
 * @date Jun 29, 2017 10:54:34 AM
 */
public class ArrayTest {
    public static void main(String[] args) {
        int[]  arr = new int[6];
        
//        for (int i = 0; i < 6; i++) {
//            System.out.println(arr[i]);
//        }
        arr[0] = 5;
        arr[1] = 15;
        arr[2] = 25;
        arr[3] = 35;
        arr[4] = 45;
        arr[5] = 55;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
