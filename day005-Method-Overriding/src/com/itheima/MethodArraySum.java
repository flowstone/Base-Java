package com.itheima;
/**
 * 方法的练习之数组元素求和
 * @author Yao Xue
 * @date Jul 1, 2017 5:11:30 PM
 */
public class MethodArraySum {
    public static void main(String[] args) {
        int[] arr = {13,42,35,74,80,90};
        int sum = sum(arr);
        System.out.println("数组元素和"+sum);
    }
    
    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        
        return sum;
    }
}
