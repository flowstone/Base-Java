package org.xueyao.method;

import java.util.Scanner;

/**
 * 键盘录入两个数据，返回两个数中的较大值
 * @author Yao Xue
 * @date Jun 29, 2017 7:16:14 PM
 */
public class NumberMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("请输入第一个数据");
        int num1 = sc.nextInt();
        
        System.out.println("请输入第二个数据");
        int num2 = sc.nextInt();
        
        int max = getMax(num1, num2);
        System.out.println("两个数中最大的数是"+max);
    }
    
    /**
     * 
     * @Title: getMax
     * @Description: TODO 获得两个数中较大值
     * @param num1
     * @param num2
     * @return int
     */
    public static int getMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
       
    }

}
