package org.xueyao.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jun 28, 2017 8:53:53 PM
 * 第一题：分析以下需求，并用代码实现
    1.键盘录入班级人数
    2.根据录入的班级人数创建数组
    3.利用随机数产生0-100的成绩(包含0和100)
    4.要求:
        (1)打印该班级的不及格人数
        (2)打印该班级的平均分
        (3)演示格式如下:
            请输入班级人数:
            键盘录入:100
            控制台输出:
                不及格人数:19
                班级平均分:87
 */
public class ClassNoPassAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("请输入班级人数：");
        //从键盘获取班级人数
        int classNumber = sc.nextInt();
        //根据获得班级人数创建数组
        int[] number = new int[classNumber];
        //
        int noPassCount = 0;
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            number[i] = r.nextInt(101);
            sum += number[i];
            if (number[i] < 60) {
                noPassCount++;
            } 
        }
        int classAvg = sum / classNumber;
        System.out.println("不及格人数:"+noPassCount);
        System.out.println("班级平均分:"+classAvg);
    }
}
