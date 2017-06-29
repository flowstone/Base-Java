package com.itheima;
/**
 * @author Yao Xue
 * @date Jun 29, 2017 3:54:21 PM
 */
public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = {22, 33, 4, 56, 33};
        
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("min:"+min);
      
    }
}
