package com.itheima;

import java.util.Scanner;

/**
 * *需求：数组元素查找(查找指定元素第一次在数组中出现的索引)
 *(1)给定数组int[] arr = {5,7,3,2,5};
 *(2)要查询的元素通过键盘录入的方式确定
 *(3)定义一个查找数组元素第一次出现位置的方法(注,要查找的元素就是键盘录入的数据)
 *
 *分析：
 *      A:给定数组int[] arr = {5,7,3,2,5};
 *      B:要查询的元素通过键盘录入的方式确定
 *      C:定义一个查找数组元素第一次出现位置的方法
 *          遍历数组，获取到每一个元素，进行比较，如果想等，就直接把该处的索引返回。
 *      D:调用方法，输出结果
 * @author Yao Xue
 * @date Jul 2, 2017 1:14:41 PM
 */
public class ArrayFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,7,3,2,5};
        System.out.println("请输入要查询的元素");
        int findNumber = sc.nextInt();
        int index = FindNumber(arr, findNumber);
        if (index == -1) {
            System.out.println("没有找到该元素");
        } else {
            System.out.println("找到该元素索引是"+index);
        }
        
    }
    
    public static  int  FindNumber(int[] arr, int findNumber) {
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findNumber) {
                return i;
            }
        }
        return -1;
    }
}
