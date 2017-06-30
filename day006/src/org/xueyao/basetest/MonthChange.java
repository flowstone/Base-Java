package org.xueyao.basetest;

import java.util.Scanner;

/**
 * TODO 需求：键盘录入一个月份，输出该月份对应的季节。
 *      一年有四季
 *      3,4,5   春季
 *      6,7,8   夏季
 *      9,10,11 秋季
 *      12,1,2  冬季
 * 
 * 分析：
 *      A:键盘录入一个月份,用Scanner实现
 *      B:判断该月份是几月,根据月份输出对应的季节
 *          if
 *          switch
 *
 * @author Yao Xue
 * @date Jun 30, 2017 5:53:39 PM
 */
public class MonthChange {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个月份(1-12)");
        int month = sc.nextInt();
        change(month);
    }
    
    public static void change(int month) {
        if (month > 0 && month <=12) {
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
        } else {
            System.out.println("输入的数据错误");
        }
    }
}
