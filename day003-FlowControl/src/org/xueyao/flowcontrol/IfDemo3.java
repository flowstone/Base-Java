package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * if语句格式3：
 *      if (关系表达式1) {
 *          语句体1;
 *      } else if (关系表达式2) {
 *          语句体2;
 *      } else if (关系表达式3) {
 *          语句体3;
 *      }
 *      ...
 *        else {
 *           语句体n+1;
 *        }
 */
public class IfDemo3 {
    public static void main(String[] args) {
        System.out.println("开始");
        
        /*
         * 键盘录入一个整数，使用if语句判断x取值范围
            x和y的关系满足如下：
                x>=3        y = 2x + 1;
                -1<=x<3 y = 2x;
                x<=-1       y = 2x – 1;
                            根据给定的x的值，计算出y的值并输出。

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x = sc.nextInt();
        int y ;
        
        if (x >= 3) {
            y = 2 * x + 1;
        } else if (x >= -1 && x < 3) {
            y = 2 * x;
        } else if (x <= -1) {
            y = 2 * x - 1;
        } else {
            y = 0;
            System.out.println("不存在这样的x");
        }
        
        System.out.println("y:"+y);
        
        System.out.println("结束");
    }
}
