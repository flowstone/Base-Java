package com.itheima;

import java.util.Scanner;

/**
 * * 需求：
 *      有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
 *      假如兔子都不死，问第二十个月的兔子对数为多少？ 
 * 
 * 规律：
 *      第一个月：1
 *      第二个月：1
 *      第三个月：2
 *      第四个月：3
 *      第五个月：5
 *      ...
 * 
 *      规律：从第三个月开始，每个月的兔子对数是前两个月的兔子对数之和。
 *          第一个月和第二个月的兔子对数是1
 * 分析：
 *      int[] arr = new int[20];
 * 
 *      arr[0] = 1;
 *      arr[1] = 1;
 * 
 *      arr[2] = arr[0] + arr[1];
 *      arr[3] = arr[1] + arr[2];
 *      arr[4] = arr[2] + arr[3];
 * @author Yao Xue
 * @date Jul 2, 2017 12:06:58 PM
 */
public class NoDieRabbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字(月份)");
        int month = sc.nextInt();
        if (month >= 2) {
            printRabbit(month);
            //--------递归---------
            //int num = recursionRabbit(month);
            //System.out.println(num);
        } else {
            System.out.println("请输入合法数字");
        }
        
    }
    
    /**
     * @Description: TODO 采用数组打印兔子
     * @return: void
     */
    public static void printRabbit(int month) {
        int[] rabbit = new int[month];
        rabbit[0] = 1;
        rabbit[1] = 1;
        for (int i = 2; i < rabbit.length; i++) {
            rabbit[i] = rabbit[i-1] + rabbit[i-2];
        }
       
        
        System.out.println("第"+month+"个月的兔子对数为"+rabbit[month-1]);
    }
    
    /**
     * @Description: TODO 采用递归计算兔子的数量
     * @return: int
     */
    public static int recursionRabbit(int month) {
        if (month == 1 || month == 2) {
            return 1;
        } else {
            return recursionRabbit(month-1) + recursionRabbit(month-2);
        }
    }
}
