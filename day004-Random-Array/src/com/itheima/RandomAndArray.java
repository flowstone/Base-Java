package com.itheima;

import java.util.Random;

/**
 * @author Yao Xue
 * @date Jun 29, 2017 4:44:27 PM
 */
public class RandomAndArray {
    public static void main(String[] args) {
        /*
         * 产生一个20-50之间的随机数,用来定义我们数组的长度
         * 然后遍历数组，依次给数组赋值。赋值的数据是33-99之间的随机数
         * 并遍历打印出来
         */
        Random r = new Random();
        
        int number = r.nextInt(31) + 20;
        System.out.println("产生的随机数是"+number);
        int[] arr = new int[number];
        
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(67) + 33;
            System.out.print(arr[i]+" ");
        }
    }
}
