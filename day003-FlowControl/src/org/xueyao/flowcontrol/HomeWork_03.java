package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * 第三题：分析以下需求，并用代码实现：
    1.根据工龄(整数)给员工涨工资(整数),工龄和基本工资通过键盘录入
    2.涨工资的条件如下：
        [10-15)     +5000
        [5-10)      +2500
        [3~5)       +1000
        [1~3)       +500
        [0~1)       +200
    3.如果用户输入的工龄为10，基本工资为3000，程序运行后打印格式"您目前工作了10年，基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元"
 */
public class HomeWork_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的工龄(单位:年)");
        int year = sc.nextInt();
        System.out.println("请输入您的基本工资(单位:元)");
        int baseSalary = sc.nextInt();
        //初始化涨后工资
        int lastSalary = 0;
        if (year < 0 || baseSalary <= 0) {
            System.out.println("您输入的工龄或基本工资有误,请重新输入");
        } else {
            if (year >=10 && year <15) {
                lastSalary = baseSalary + 5000;
            } else if (year >= 5 && year < 10) {
                lastSalary = baseSalary + 2500;
            } else if (year >= 3 && year < 5) {
                lastSalary = baseSalary + 1000;
            } else if (year >=1 && year < 3) {
                lastSalary = baseSalary + 500;
            } else {
                lastSalary = baseSalary + 200;
            }
        }
        System.out.println("您目前工作了"+year+"年，基本工资为 "
                +baseSalary+"元, 应涨工资 "+(lastSalary-baseSalary)
                +"元,涨后工资 "+lastSalary+"元");
        
        
    }
}
