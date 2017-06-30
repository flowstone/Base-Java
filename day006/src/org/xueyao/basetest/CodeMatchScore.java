package org.xueyao.basetest;

import java.util.Scanner;

/**
 * 需求：在编程竞赛中，有6个评委为参赛的选手打分，分数为0-100的整数分。
 * 选手的最后得分为：去掉一个最高分和一个最低分后 的4个评委平均值。
 * 请写代码实现。(不考虑小数部分)
 *  分析：
 *      A:定义一个长度为6的数组
 *      B:键盘录入评委的分数
 *      C:写方法实现获取最高分,最低分
 *      D:写方法求评委的分数和
 *      E:平均分：(和-最高分-最低分)/(arr.length-2)
 *      F:输出平均分即可
 * @author Yao Xue
 * @date Jun 30, 2017 7:00:06 PM
 */
public class CodeMatchScore {
    public static void main(String[] args) {
        int[] arr = new int[6];
        MatchScore(arr);
        int max = scoreMax(arr);
        int min = scoreMin(arr);
        int sum = scoreSum(arr);
        int avg = scoreAvg(arr, max, min);
        System.out.println("6位评委的分数为");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("选手最高分为"+max);
        System.out.println("选手最低分为"+min);
        System.out.println("选手总分为"+sum);
        System.out.println("选手的平均分为"+avg);
    }
    
    public static void MatchScore(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入第"+(i+1)+"个评委给出的分数(1-100)");
            arr[i] = sc.nextInt();
        }
        
        
       
    }
    
    public static int scoreMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    
    public static int scoreMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    
    public static int scoreSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
    public static int scoreAvg(int[] arr, int max, int min) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (sum - max - min) / arr.length-2;
    }
    
    
}
