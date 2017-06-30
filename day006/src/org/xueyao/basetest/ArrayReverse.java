package org.xueyao.basetest;

import java.util.Scanner;

/**
 * 需求：
 * (1)键盘录入5个int类型的数据存储数组arr中
 * (2)定义方法将arr数组中的内容反转
 * (3)定义方法对反转后的数组进行遍历
 * 
 * 分析：
 *      A:定义一个长度为5的数组
 *      B:通过键盘录入数据给数组中的元素赋值
 *      C:定义方法将arr数组中的内容反转
 *          什么是反转?如何实现反转
 *      D:定义方法对反转后的数组进行遍历
 * @author Yao Xue
 * @date Jun 30, 2017 7:39:27 PM
 */
public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数字：");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("反转之前的数组为");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.println(arr[i]+"]");
            } else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.println();

        
        reverse(arr);
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.println(arr[i]+"]");
            } else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.println();

    }
    
    public static void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
