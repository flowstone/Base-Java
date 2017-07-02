package com.itheima;

import java.util.Scanner;

/**
 * 
 * 
 * 需求：键盘录入一个月份，输出该月份对应的季节。
 *      一年有四季
 *      3,4,5   春季
 *      6,7,8   夏季
 *      9,10,11 秋季
 *      12,1,2  冬季
 * 
 * 分析：
 *      A:键盘录入一个月份,用Scanner实现
 *      B:判断该月份是几月，根据月份输出对应的季节
 *          if
 *          switch
 *
 * @author Yao Xue
 * @date Jul 2, 2017 11:39:50 AM
 */
public class MonthDebug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入月份");
        int month = sc.nextInt();
        
        printMonth(month);
    }

    public static void printMonth(int month) {
        if (month <= 0 || month > 12) {
            System.out.println("输入月份错误");
        } else {
            switch (month) {
            case 3:
            case 4:    
            case 5:
                System.out.println("春季");
                break;
            case 6:
            case 7:    
            case 8:
                System.out.println("夏季");
                break;
            case 9:
            case 10:    
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("冬季");
                break;
            }
        }
    }
}
