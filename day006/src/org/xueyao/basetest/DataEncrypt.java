package org.xueyao.basetest;

import java.util.Scanner;

/**
 * 需求：键盘录入数据,要求数据是四位的整数,现需要对数据进行加密,加密规则如下:
 * 每位数字都加上5,然后除以10的余数代替该数字,
 * 再将第一位和第四位交换,第二位和第三位交换,
 * 请把加密后的数据输出到控制台
 * 
 * 分析：
 *      A:键盘录入一个4位数
 *          举例：4567
 *      B:定义一个长度为4的数组
 *          int[] arr = new int[4];
 *          arr = {4,5,6,7};
 *      C:对数组中的数据进行加密规则的操作
 *          每位数字都加上5,然后除以10的余数代替该数字
 *              arr[x] += 5;
 *              结果：arr = {9,10,11,12};
 *              arr[x] %= 10;
 *              结果：arr = {9,0,1,2};
 *          再将第一位和第四位交换,第二位和第三位交换
 *              结果：arr = {2,1,0,9};
 *      D:请把加密后的数据输出到控制台
 * @author Yao Xue
 * @date Jun 30, 2017 8:36:10 PM
 */
public class DataEncrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要加密的四位数字");
        int data = sc.nextInt();
        int[] arr = new int[4];
        
        encrypt(arr,data);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    
    public static void encrypt(int[] arr, int data) {
        arr[0] = data / 10 / 10 / 10 % 10;
        arr[1] = data / 10 / 10 % 10;
        arr[2] = data / 10 % 10;
        arr[3] = data % 10;
       
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
            arr[i] %= 10;
        }
       
        for (int i = 0,j = arr.length - 1; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
