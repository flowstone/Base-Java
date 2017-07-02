package org.xueyao.newhomework;

import java.util.Random;

/**
 * 第三题:分析以下需求，并用代码实现
    创建一个长度为10的数组，数组内元素为随机生成的 1-100之间的整数，最后遍历这个数组
 * @author Yao Xue
 * @date Jul 2, 2017 9:09:12 PM
 */
public class HomeWork_03 {
    public static void main(String[] args) {
        printArray(10);
    }

    public  static void printArray(int i) {
        // TODO Auto-generated method stub
        int[] arr = new int[i];
        Random r = new Random();
        for (int j = 0; j < arr.length; j++) {
            arr[j] = r.nextInt(100)+1;
        }
        System.out.print("[");
        for (int j = 0; j < arr.length; j++) {
            if (j == arr.length-1) {
                System.out.print(arr[j]+"]");
            } else {
                System.out.print(arr[j]+", ");
            }
        }
    }
}
