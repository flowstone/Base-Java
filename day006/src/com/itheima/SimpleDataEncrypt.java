package com.itheima;

import java.util.Scanner;

/**
 *  * 需求：键盘录入数据,要求数据是四位的整数,现需要对数据进行加密,加密规则如下:
 * 每位数字都加上5,然后除以10的余数代替该数字,
 * 再将第一位和第四位交换,第二位和第三位交换,
 * 请把加密后的数据输出到控制台
 * 
 * 分析：
 *      A:键盘录入一个四位数
 *      B:对数据进行加密
 *          举例：
 *              4567
 *              把这个四位数分成个，十，百，千存储到数组中
 *              int[] arr = {4,5,6,7};
 *              每位数字都加上5：
 *                  arr[x] += 5;    {9,10,11,12}
 *              然后除以10的余数代替该数字：
 *                  arr[x] %= 10;   {9,0,1,2}
 *               再将第一位和第四位交换,第二位和第三位交换：
 *                  {9,0,1,2}       {2,1,0,9}
 *      C:输出加密后的数据
 * @author Yao Xue
 * @date Jul 2, 2017 1:26:59 PM
 */
public class SimpleDataEncrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入四位数字");
        int number = sc.nextInt();
        int[] arr = new int[4];
        createArray(arr,number);
        //判断加密数据是否是四位数
        if (number >9999 || number < 1000) {
            System.out.println("输入加密数据位数不正确，请重新输入");
        } else {
            arithmeticEncrypt(arr);
            
            swapEncrypt(arr);
            printData(arr);
        }
    }
    /**
     * @Description: TODO  生成加密后数据
     * @return: void
     */
    public static void printData(int[] arr) {
       
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]);
        }
    }
    /**
     * @Description: TODO 交换加密
     * @return: void
     */
    public static void swapEncrypt(int[] arr) {
        for (int i = 0,j = arr.length-1; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
    /**
     * @Description: TODO 算术加密
     * @return: void
     */
    public static void arithmeticEncrypt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
            arr[i] %= 10;
        }
    }
    /**
     * @Description: TODO 把数字转换成数组方便加密
     * @return: void
     */
    public static void  createArray(int[] arr,int number) {
        
        arr[3] = number % 10;
        arr[2] = number / 10 % 10;
        arr[1] = number / 10 / 10 % 10;
        arr[0] = number / 10 / 10 / 10 % 10;
    }
}
