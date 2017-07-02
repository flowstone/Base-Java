package org.xueyao.newhomework;

import java.util.Scanner;

/**
 * 第四题: 分析以下需求，并用代码实现
    1.键盘录入10个整数存入数组中
    2.定义一个方法将奇数放在数组的左侧,偶数放在数组的右侧
    3.定义一个方法打印原数组和处理后的数组
 * @author Yao Xue
 * @date Jul 2, 2017 9:09:34 PM
 */
public class HomeWork_04 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数据");
            arr[i] = sc.nextInt();
        }
        
        int[] arr1 = arraySwap(arr);
        printArray(arr);
        System.out.println();
        printArray(arr1);
    }
    /**
     * @Description: TODO 定义一个方法打印原数组和处理后的数组
     * @return: void
     */
    public static void printArray(int[] arr1) {
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i]+"]");
            } else {
                System.out.print(arr1[i]+", ");
            }
        }
    }
    /**
     * @Description: TODO 定义一个方法将奇数放在数组的左侧,偶数放在数组的右侧
     * @return: int[]
     */
    public static int[] arraySwap(int[] arr) {
        int[] arr1 = new int[arr.length];
        int start = 0;
        int end = arr1.length-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 !=0) {
                arr1[start] = arr[i];
                start++;
            } else {
                arr1[end] = arr[i];
                end--;
            }
        }
        return arr1;
    }
}
