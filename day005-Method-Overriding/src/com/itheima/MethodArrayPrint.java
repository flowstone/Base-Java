package com.itheima;
/**
 * 方法之数组遍历
 * @author Yao Xue
 * @date Jul 1, 2017 4:44:54 PM
 */
public class MethodArrayPrint {
    public static void main(String[] args) {
        int[] arr = {2,5,7,9,4,2,4,6};
        arrayPrint(arr);
    }
    
    public static void arrayPrint(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.print(arr[i]+"]");
            } else {
                System.out.print(arr[i]+",");
            }
        }
    }
}
