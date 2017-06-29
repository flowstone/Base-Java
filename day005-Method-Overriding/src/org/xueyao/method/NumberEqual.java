package org.xueyao.method;

import java.util.Scanner;

/**
 * 键盘录入两个数据，比较两个数是否相等
 * @author Yao Xue
 * @date Jun 29, 2017 7:30:42 PM
 */
public class NumberEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("请输入一个数据");
        int num1 = sc.nextInt();
        
        System.out.println("请输入二个数据");
        int num2 = sc.nextInt();
        
        boolean equal = compare(num1, num2);
        System.out.println(num1+"与"+num2+"是否相等："+equal);
        
    }
    
    /**
     * 
     * @Title: compare
     * @Description: TODO  比较两个数是否相等
     * @param num1
     * @param num2
     * @return boolean
     */
    public static boolean compare(int num1, int num2) {
        if (num1 == num2) {
            return true;
        } else {
            return false;
        }
    }
}
