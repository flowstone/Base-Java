package org.xueyao.homework;

import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jun 29, 2017 11:48:16 PM
 */
public class HomeWork_03 {
    public static void main(String[] args) {
        /*
         * 第三题：分析以下需求，并用代码实现
        1.键盘录入长方形的长和宽
                        定义方法计算该长方形的周长,并在main方法中打印周长
        2.键盘录入长方形的长和宽
                        定义方法计算该长方形的面积,并在main方法中打印面积
        3.键盘录入圆的半径
                        定义方法计算该圆的周长,并在main方法中打印周长
        4.键盘录入圆的半径
                        定义方法计算该圆的面积,并在main方法中打印面积
         */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入长方形的长");
        double length = sc.nextDouble();
        System.out.println("请输入长方形的宽");
        double width = sc.nextDouble();
        System.out.println("该长方形的周长为"+rectanglePerimeter(length, width));
        System.out.println("该长方形的面积为"+rectangleArea(length, width));
        
        System.out.println("请输入圆的半径");
        double radius = sc.nextDouble();
        System.out.println("该圆的的周长为"+circlePerimeter(radius));
        System.out.println("该圆的的面积为"+circleArea(radius));
    }
    
    public static double rectanglePerimeter(double length, double width) {
        return (length + width) * 2;
    }
    
    public static double rectangleArea(double length, double width) {
        return length * width;
    }
    
    public static double circlePerimeter(double radius) {
        return 2 * radius * 3.14;
    }
    
    public static double circleArea(double radius) {
        return radius * radius * 3.14;
    }
}
