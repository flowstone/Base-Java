package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * 第四题：分析以下需求，并用代码实现：
    1.键盘录入三个整数，按照从小到大的顺序输出
    2.如果用户输入的是3 2 1，程序运行后打印格式"按照从小到大排序后的顺序为：1 2 3"
    5 2 3
    2 3 5
 */
public class HomeWork_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数");
        int number2 = sc.nextInt();
        System.out.println("请输入第三个数");
        int number3 = sc.nextInt();
        /* 方法一
        int temp =number1 > number2 ? number1 : number2;
        int max = temp > number3 ? temp : number3;
        
        temp = number1 < number2 ? number1 : number2;
        int min = temp < number3 ? temp : number3;
        int sum = number1 + number2 + number3;
        System.out.println("按照从小到大排序后的顺序为："+min+" "+(sum-max-min)+" "+max);
        */
        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number1 > number3) {
            int temp = number1;
            number1 = number3;
            number3 = temp;
        }
        if (number2 > number3) {
            int temp = number2;
            number2 = number3;
            number3 = temp;
        }
       
        System.out.println("按照从小到大排序后的顺序为："+number1+", "+number2+", "+number3);
        
    }
}
