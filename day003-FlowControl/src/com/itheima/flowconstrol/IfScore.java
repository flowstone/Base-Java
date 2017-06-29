package com.itheima.flowconstrol;

import java.util.Scanner;

public class IfScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生成绩");
        
        int studentScore = sc.nextInt();
        if (studentScore < 0 || studentScore > 100) {
            System.out.println("输入学生成绩错误");
        } else {
            if (studentScore >= 90 && studentScore <= 100) {
                System.out.println("优秀");
            } else if (studentScore >= 80 && studentScore < 90) {
                System.out.println("好");
            } else if (studentScore >= 70 && studentScore <80) {
                System.out.println("良");
            } else if (studentScore >= 60 && studentScore <70) {
                System.out.println("及格");
            } else {
                System.out.println("不及格");
            }
        }
        
    }
}
