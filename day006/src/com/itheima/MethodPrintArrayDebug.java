package com.itheima;
/**
 * @author Yao Xue
 * @date Jul 2, 2017 11:36:02 AM
 */
public class MethodPrintArrayDebug {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        change(arr);
        printArray(arr);
        
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        
    }

    public static void change(int[] arr) {
        // TODO Auto-generated method stub
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] *= 2;
            }
        }
    }

}
