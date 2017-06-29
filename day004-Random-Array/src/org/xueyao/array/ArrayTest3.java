package org.xueyao.array;
/*
 * 定义两个个数组，先定义一个数组，赋值，输出。然后定义第二个数组的时候把第一个数组的地址赋值给第二
 * 个数组。然后给第二个数组赋值，再次输出两个数组的名及元素
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("------------");
        
        //定义第二个数组的时候把第一个数组的地址赋值给第二个数组。
        int[] arr2 = arr;
        arr2[0] = 400;
        arr2[1] = 500;
        arr2[2] = 600;
        
        //次输出两个数组的名及元素
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("-------------");
        
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println("-------------");
    }
}
