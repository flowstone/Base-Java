package com.itheima.flowconstrol;

import java.util.Scanner;
/*
 * 输入1-7之间的数值
 * 使用switch语句判断输出对应的星期
 */
public class SwitchWeekday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1-7之间的数字");
        int weekday = sc.nextInt();
        
        if (weekday < 1 || weekday > 7) {
            System.out.println("您输入的非法数据，请重新输入");
        } else {
            switch (weekday) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            default:
                System.out.println("星期天");
                break;
            }
        }
    }
}
