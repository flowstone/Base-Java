package org.xueyao;

import java.util.Scanner;

/**
     获取数组中元素值的最大值与最小值的差值，要求如下： 
    定义int getNum(int[] arr)静态方法，该方法要求完成：获取指定数组arr中元素值的最大值和最小值的差值（要求返回的差值大于等于0），并返回
    定义main方法，在main方法中完成：
    1.键盘录入5个整数，并存放在int数组arr中，输入前提示输入的是第几个值
    2.传递数组arr调用getNum(int[] arr)方法，获取返回值，并在控制台打印输出返回值
     
 * @author Yao Xue
 * @date Jul 1, 2017 7:06:42 PM
 */
public class Test_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个值");
            arr[i] = sc.nextInt();
        }
        
        int result = getNum(arr);
        System.out.println("数组中最大值和最小值的差值为"+result);
    }
    
    public static int getNum(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if(min > arr[i]) {
                min = arr[i];
            }
        }
        return max - min;
    }
}
