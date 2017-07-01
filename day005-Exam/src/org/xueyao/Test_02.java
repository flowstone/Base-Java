package org.xueyao;

import java.util.Scanner;

/**
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
