package com.itheima;

import java.util.Scanner;

/**
 * 需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
 * 选手的最后得分为：去掉一个最高分和一个最低分后 其余4个选手的平均值。
 * 请写代码实现。(不考虑小数部分)
 * 
 * 分析：
 *      A:定义一个长度为6的数组。
 *      B:通过键盘录入的方式给出评委的分数
 *      C:写方法实现获取数组中的最大值，最小值
 *      D:写方法实现数组元素的求和
 *      E:平均分： (和-最高分-最低分)/(arr.length-2)
 *      F:输出分数即可
 * @author Yao Xue
 * @date Jul 2, 2017 12:50:29 PM
 */
public class CodeMatchScore {
    public static void main(String[] args) {
        int[] score = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.println("请第"+(i+1)+"位评委给选手打分,分数为0-100的整数分");
            score[i] = sc.nextInt();
        }
        
        int max = getMax(score);
        
        int min = getMin(score);
        
        int sum = getSum(score);
        
        int avg = (sum - max - min) / (score.length-2);
        System.out.println("选手平均分是"+avg);    
        
    }

    public static int getSum(int[] score) {
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return sum;
    }

    public static int getMin(int[] score) {
        int min = score[0];
        for (int i = 0; i < score.length; i++) {
           
            if (min > score[i]) {
                min = score[i];
            }
        }
        return min;
    }

    public static int getMax(int[] score) {
        int max = score[0];
        for (int i = 0; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }
        return max;
    }
}
