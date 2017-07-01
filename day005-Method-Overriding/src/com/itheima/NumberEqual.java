package com.itheima;

import java.util.Scanner;

/**
 * 方法练习之比较两个数据是否相等
 * @author Yao Xue
 * @date Jul 1, 2017 11:32:06 AM
 */
public class NumberEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int num2 = sc.nextInt();
        String equal = getEqual(num1, num2);
        System.out.println(num1+"与"+num2+equal);
    }
    
    public static String getEqual(int num1, int num2) {
        return num1 == num2 ? "相等" : "不相等";
    }
}
