package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * 第二题：分析以下需求，并用代码实现：
    1.键盘录入一个整数给变量x，输出对应的变量y的值
    2.x值和y值的对应关系如下：
        x<0 y=-1
        x=0 y=0
        x>0 y=1
    3.如果用户输入的x的值为2，程序运行后打印格式"x=2,y=1"
 */
public class HomeWork_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x = sc.nextInt();
        int y = 0;
        if (x < 0) {
            y = -1;
        } else if (x == 0) {
            y = 0;
        } else if (x > 0) {
            y = 1;
        } 
        
        System.out.println("x="+x+",y="+y);
    }
}
