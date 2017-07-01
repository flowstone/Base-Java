package org.xueyao;

import java.util.Scanner;

/**
 * 【程序5】
题目：利用关系运算符的嵌套来完成此题：
学习成绩>=90分的同学用A表示，60-89分之间的用B表示，
60分以下的用C表示。

 * @author Yao Xue
 * @date Jul 1, 2017 6:15:39 PM
 */
public class StudyScore_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学习成绩：");
        int score = sc.nextInt();
        scoreLevel(score);
    }
    
    public static void scoreLevel(int score) {
        if (score <0 || score > 100) {
            System.out.println("输入数据错误");
        } else {
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 60 && score <= 89) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        }
    }
}
