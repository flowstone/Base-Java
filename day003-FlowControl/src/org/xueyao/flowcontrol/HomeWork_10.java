package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * 第十题:分析以下需求，并用代码实现：
    1.键盘录入学生成绩(整数类型),如果录入的成绩为-1表示录入结束
    2.打印输出录入的学生成绩的平均值
    
    分析:
        无法判断循环次数,只能选择while或者do{}while();
   当录入成绩为-1，录入结束用 if语句判断用户是否输入-1，输入-1则跳出while循环 
 */
public class HomeWork_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        double sum = 0;
        while (true) {
            System.out.println("请输入第"+(i+1)+"个学生成绩");
            double studenScore = sc.nextDouble();
            if (studenScore == -1) {
                System.out.println("录入结束");
                break;
            }
           
            sum += studenScore;
            i++;
        }
        double avg = sum / i;
        System.out.println("您输入了"+i+"学生的成绩,他们成绩平均分为"+avg);
    }
}
