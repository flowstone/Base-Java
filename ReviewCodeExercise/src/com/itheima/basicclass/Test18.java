package com.itheima.basicclass;

import java.util.Scanner;

/*
 * 需求：键盘录入两个数据，返回两个数中的较大值
 * 
 * 两个明确：
 * 		返回值类型：int
 * 		参数列表：int a,int b
 */
public class Test18 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    
		System.out.println("请输入第一个数");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个数");
		int num2 = sc.nextInt();
		int max = getMax(num1, num2);
		System.out.println("max:"+max);
	}

    public static int getMax(int num1, int num2) {
        // TODO Auto-generated method stub
        return num1 > num2 ? num1 : num2;
    }
}
