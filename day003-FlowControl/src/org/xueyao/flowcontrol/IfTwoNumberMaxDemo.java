package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * 键盘输入两个数，比较其中最大的数
 */
public class IfTwoNumberMaxDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int number2 = sc.nextInt();
        
        int max = 0;
        if (number1 > number2) {
            max = number1;
        } else {
            max = number2;
        }
        
        System.out.println("两个数中最大的是"+max);
        
    }
}
