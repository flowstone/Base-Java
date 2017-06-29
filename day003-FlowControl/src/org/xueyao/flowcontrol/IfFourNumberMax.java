package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * 键盘录入四个整数，获取这四个数中最大的数并打印。[要求使用if语句]
提示：两两比较的结果再比较一次

 */
public class IfFourNumberMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个整数");
        int number2 = sc.nextInt();
        System.out.println("请输入第三个整数");
        int number3 = sc.nextInt();
        System.out.println("请输入第四个整数");
        int number4 = sc.nextInt();
        
        int max1 = 0;
        //前两个数据比较
        if (number1 > number2) {
            max1 = number1;
        } else {
            max1 = number2;
        }
        
        int max2 = 0;
        //后两个数据比较
        if (number3 > number4) {
            max2 = number3;
        } else {
            max2 = number4;
        }
        
        int max = 0;
        //两次比较后最大值之间的比较
        if (max1 > max2) {
            max = max1;
        } else {
            max = max2;
        }
        
        System.out.println("四个数字中最大的数是"+max);
    }
}
