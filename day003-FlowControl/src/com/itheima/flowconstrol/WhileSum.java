package com.itheima.flowconstrol;
/*
 * 用while语句 计算1-100的和
 */
public class WhileSum {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println("1-100的和是"+sum);
    }
}
