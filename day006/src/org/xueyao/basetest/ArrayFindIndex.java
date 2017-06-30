package org.xueyao.basetest;

import java.util.Scanner;

/**
 *  需求：数组元素查找(查找指定元素第一次在数组中出现的索引)
 *(1)给定数组int[] arr = {5,7,3,2,5};
 *(2)要查询的元素通过键盘录入的方式确定
 *(3)定义一个查找数组元素第一次出现位置的方法(注,要查找的元素就是键盘录入的数据)
 *
 *分析：
 *      A:定义数组int[] arr = {5,7,3,2,5};
 *      B:键盘录入一个被查询的数据
 *      C:写方法实现查找指定元素在数组中第一次出现的索引
 *          遍历数组，依次比较元素，如果相等，就把该处的索引返回即可
 *      D:调用方法,输出结果
 *
 * @author Yao Xue
 * @date Jun 30, 2017 8:23:50 PM
 */
public class ArrayFindIndex {
    public static void main(String[] args) {
        int[] arr = {5,7,3,2,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的数据");
        int value = sc.nextInt();
        int index = findIndex(arr, value);
        if (index >= 0) {
            System.out.println("查询到数据，下标是"+index);
        } else {
            System.out.println("数组中没有查询的数据");
        }
    }
    
    public static int findIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
