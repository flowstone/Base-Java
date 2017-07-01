package org.xueyao;

import java.util.Scanner;

/**
 * 考试成绩分等级，请根据键盘输入的成绩，输出对应的成绩等级，要求：
    1.键盘录入一个正整数；
    2如果录入的整数在0~100（包含0和100）之间可以一直录入并根据键盘录入的成绩，输出对应的成绩等级; ，如果录入的整数不在0~100（包含0和100）之间就结束键盘录入，并提示成绩录入结束
    成绩等级提示如下：
        90~100  A等。
        80~89   B等。
        70~79   C等。
        60~69   D等。
        60~0    E等。
        小于0或者大于100  成绩录入结束

 * @author Yao Xue
 * @date Jul 1, 2017 7:15:04 PM
 */
public class Test_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
           System.out.println("请输入一个正整数：");
           int score = sc.nextInt();
           if (score > 100 || score < 0) {
               System.out.println("录入成绩结束");
               break;
           } else {
               if (score >= 90 && score <= 100) {
                   System.out.println("A等");
               } else if (score >= 80 && score <= 89) {
                   System.out.println("B等");
               } else if (score >= 70 && score <=79) {
                   System.out.println("C等");
               } else if (score >= 60 && score <= 69) {
                   System.out.println("D等");
               } else {
                   System.out.println("E等");
               }
           }
        }
    }
}
