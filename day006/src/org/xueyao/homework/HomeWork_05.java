package org.xueyao.homework;

import java.util.Random;

/**
 * 第六题:分析以下需求，并用代码实现
    1.创建两个长度为10的数组，数组内元素为随机生成的、不重复的 1-100之间的整数，
    2.定义一个方法，传入两个数组，函数中将两个数组不同的元素拼接成一个字符串，并且将该字符串以及字符串的长度输出到控制台上；
        如果没有则输出"对不起两个数组的所有元素均相同"
 * @author Yao Xue
 * @date Jul 1, 2017 9:34:39 PM
 */
public class HomeWork_05 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        //数组内元素为随机生成的、不重复的 1-100之间的整数
        arr1[0] = r.nextInt(100)+1;
        for (int i = 0; i < arr1.length; ) {
            int temp = r.nextInt(100)+1;;
            //System.out.println("------"+temp);
            for (int j = 0; j < arr1.length; j++) {
                if (temp == arr1[j] && j!=i) {
                    break;
                } else if (j == arr1.length - 1) {
                    arr1[i] = temp;
                    i++;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("---------");
        arr2[0] = r.nextInt(100)+1;
        for (int i = 0; i < arr2.length; ) {
            int temp = r.nextInt(100)+1;;
            //System.out.println("------"+temp);
            for (int j = 0; j < arr2.length; j++) {
                if (temp == arr2[j] && j!=i) {
                    break;
                } else if (j == arr2.length - 1) {
                    arr2[i] = temp;
                    i++;
                }
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        
        
        //定义一个方法，传入两个数组，函数中将两个数组不同的元素拼接成一个字符串，并且将该字符串以及字符串的长度输出到控制台上
        arraySplice(arr1,arr2);
    }

    public static void arraySplice(int[] arr1, int[] arr2) {
        // TODO Auto-generated method stub
        
    }
}
