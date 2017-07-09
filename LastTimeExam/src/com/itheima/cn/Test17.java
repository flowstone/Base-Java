package com.itheima.cn;

import java.util.Random;

/**
 * 一. 随机生成10个1-10之间的数（包括1和10），
 * 将生成的数放到数组中，
 * 计算数组中索引为奇数的元素平均值，并将结果打印到控制
 * @author Yao Xue
 * @date Jul 9, 2017 6:40:37 PM
 */
public class Test17 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10)+1;
            //System.out.println(arr[i]);
        }
        int sum = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i=i+2) {
            sum += arr[i];
            count++;
        }
        System.out.println(sum / count);
    }
}
