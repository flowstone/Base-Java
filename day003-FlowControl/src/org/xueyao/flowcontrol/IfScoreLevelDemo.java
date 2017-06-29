package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * 键盘录入学生考试成绩，根据成绩判断该学生属于哪个级别
     90-100【包含90和100】      优秀
     80-90【包含80不包含90】    好
     70-80 【包含70不包含80】   良
     60-70 【包含60不包含70】   及格
     60分以下 【不包含60】       不及格
 */
public class IfScoreLevelDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个学生的考试成绩(整数)");
        int studentScore = sc.nextInt();
        
        if (studentScore >=0 && studentScore <= 100) {
            if (studentScore >= 90 && studentScore <= 100) {
                System.out.println("优秀");
            } else if (studentScore >= 80 && studentScore < 90) {
                System.out.println("好");
            } else if (studentScore >= 70 && studentScore < 80) {
                System.out.println("良");
            } else if (studentScore >=60 && studentScore < 70) {
                System.out.println("及格");
            } else if (studentScore < 60) {
                System.out.println("不及格");
            }
        } else {
            System.out.println("你输入的学生考试成绩有误");
        }
         
        
      
    }
}
