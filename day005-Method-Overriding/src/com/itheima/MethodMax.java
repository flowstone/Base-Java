package com.itheima;

import java.util.Scanner;

/**
 * 方法练习之获取三个数据中的较大值
 * @author Yao Xue
 * @date Jul 1, 2017 11:41:34 AM
 */
public class MethodMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个数");
        int num3 = sc.nextInt();
        int max = getMax(num1, num2, num3);
        System.out.println("max:"+max);
    }
    
    public static int getMax(int num1, int num2, int num3) {
        if (num1 > num2) {
            if (num1 > num3) {
                return num1;
            } else {
                return num3;
            }
        } else {
            if (num2 > num3) {
                return num2;
            } else {
                return num3;
            }
        }
    }
}
