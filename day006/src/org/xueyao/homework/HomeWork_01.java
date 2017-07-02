package org.xueyao.homework;

import java.util.Scanner;

/**
 * 第二题: 分析以下需求，并用代码实现
    1.键盘录入6个int类型的数据存数数组arr中
    2.将arr数组中的内容反转
    3.将翻转后的数组角标为奇数的互相交换 1和3换, 3和5换,以此类推
    4.最后将数组最后一个角标为奇数的元素 和数组中第一个角标为奇数的元素交换
    5.打印最终的数组(实现了1-4步之后的数组)
    6.如：用户输入的6个int数字为[1,2,3,4,5,6],最后输出的结果为[6, 5, 4, 1, 2, 3]
 * @author Yao Xue
 * @date Jul 1, 2017 8:56:21 PM
 */
public class HomeWork_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个数据");
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        
        printArray(arr);
        //将翻转后的数组角标为奇数的互相交换 1和3换, 3和5换,以此类推
        for (int i = 1, j = 3; j <= arr.length; i=i+2, j=j+2) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        printArray(arr);
        //最后将数组最后一个角标为奇数的元素 和数组中第一个角标为奇数的元素交换
        for (int i = 1, j = arr.length-1; i <= j; j--) {
            if (j % 2 != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                break;
            }
            
        }
        
        printArray(arr);
        
    }
    /**
     * @Description: TODO 遍历数组
     * @return: void
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.print(arr[i]+"]");
            } else {
                System.out.print(arr[i]+", ");
            }
            
        }
        System.out.println();
    }
    /**
     * @Description: TODO 数组反转
     * @return: void
     */
    public static void reverseArray(int[] arr) {
        //将arr数组中的内容反转
        for (int i = 0, j = arr.length-1; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
