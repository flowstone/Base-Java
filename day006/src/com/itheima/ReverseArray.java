package com.itheima;

import java.util.Scanner;

/**
 * * 需求：
 * (1)键盘录入5个int类型的数据存储数组arr中
 * (2)定义方法将arr数组中的内容反转
 * (3)定义方法对反转后的数组进行遍历
 * 
 * 分析：
 *      A:定义一个长度为5的数组
 *      B:通过键盘录入数据给数组中的元素赋值
 *      C:定义方法将arr数组中的内容反转
 *          什么是反转?如何反转?
 *      D:定义方法遍历数组
 * @author Yao Xue
 * @date Jul 2, 2017 1:06:04 PM
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入"+(i+1)+"个数字");
            arr[i] = sc.nextInt();
        }
        
        reverse(arr);
        printArray(arr);
    }
    
    /**
     * @Description: TODO  遍历数组
     * @return: void
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.print(arr[i]+"]");
            } else {
                System.out.print(arr[i]+", ");
            }
        }
    }
    
    /**
     * @Description: TODO 数组反转
     * @return: void
     */
    public static void reverse(int[] arr) {
        for (int i = 0,j = arr.length-1; i <=j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
