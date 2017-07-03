package com.itheima.basicclass;

import java.util.Scanner;

/*
 * 需求：键盘录入三个数据，返回三个数中的最大值
 * 
 * 两个明确：
 * 		返回值类型：int
 * 		参数列表：int a,int b,int c
 */
public class Test20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个数据");
		int num2 = sc.nextInt();
		System.out.println("请输入第三个数据");
		int num3 = sc.nextInt();
		
		int max = getMax(num1, num2, num3);
		System.out.println("max:"+max);
	}

    public static int getMax(int num1, int num2, int num3) {
        // TODO Auto-generated method stub
        
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
