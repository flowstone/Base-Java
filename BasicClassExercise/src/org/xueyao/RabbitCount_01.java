package org.xueyao;

import java.util.Scanner;

/**
 *【程序1】
 *题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 *假如兔子都不死，问每个月的兔子对数为多少？ 
 * 月数         兔子对数
 * 1     1
 * 2     1 
 * 3     2
 * 4     3
 * 5     5
 * 6     8
 * @author Yao Xue
 * @date Jul 1, 2017 1:00:02 PM
 */
public class RabbitCount_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();
        rabbit(month);
    }
    
    public static void rabbit(int month) {
        int[] arr = new int[month];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
           arr[i] = arr[i-1] + arr[i-2];
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第"+(i+1)+"月-------有"+arr[i]+"对兔子");
        }
    }
}
