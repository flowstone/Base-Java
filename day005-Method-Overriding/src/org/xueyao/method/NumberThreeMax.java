package org.xueyao.method;

import java.util.Scanner;

/**
 * 键盘录入三个数据，返回三个数中的最大值
 * @author Yao Xue
 * @date Jun 29, 2017 7:37:08 PM
 */
public class NumberThreeMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("请输入第一个数据");
        int num1 = sc.nextInt();
        
        System.out.println("请输入第二个数据");
        int num2 = sc.nextInt();
        
        System.out.println("请输入第三个数据");
        int num3 = sc.nextInt();
        
        int max = getMax(num1, num2, num3);
        System.out.println("三个数中最大的是："+max);
    }
    
    /**
     * 
     * @Title: getMax
     * @Description: TODO  三个数中的最大值
     * @param num1
     * @param num2
     * @param num3
     * @return int
     */
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
