package org.xueyao.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * 第七题:分析以下需求，并用代码实现        
    1.提示用户输入10个整数，存入到int数组中；根据以下要求实现相关功能
    2.提示用户输入一个数字作为数组索引，查找数组中该索引对应的元素，
        （需要判断输入的数字是否在0-9之间包含临界值，如果该数字不符合要求则随机生成一个符合要求的索引）
    3.
     1  2   3  4   5
     2
     1  2   3  4    5 
     1  4   3  2    5        
 * @author Yao Xue
 * @date Jul 1, 2017 9:35:06 PM
 */
public class HomeWork_06 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数");
            arr[i] = sc.nextInt();
        }
        //int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        
        System.out.println("生成的数组如下：");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.print(arr[i]+"]");
            } else {
                System.out.print(arr[i]+", ");
            }
           
        }
        System.out.println();
        
        
        System.out.println("请输入一个数字(索引)");
        int index = sc.nextInt();
        
        if (index == 0 || index == arr.length-1) {
            System.out.println("索引下的元素值为"+arr[index]);
            Random r = new Random();
            index = r.nextInt(10);
            System.out.println("生成的索引为"+index);
            
        } else {
            System.out.println("索引下的元素值为"+arr[index]);
            //将a中得到的索引对应的元素的左右两边元素进行互换，若对应的元素是第一个或最后一个则不做任何操作
            if (index > 0 || index < arr.length-1) {
                int temp = arr[index-1];
                arr[index-1] = arr[index+1];
                arr[index+1] = temp;
            }
        }
        System.out.println("互换的结果：");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.print(arr[i]+"]");
            } else {
                System.out.print(arr[i]+", ");
            }
           
        }
        
        
        
    }
}
