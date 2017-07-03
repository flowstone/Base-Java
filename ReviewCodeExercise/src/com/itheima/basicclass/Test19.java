package com.itheima.basicclass;

import java.util.Scanner;

/*
 * 需求：键盘录入两个数据，比较两个数是否相等
 * 
 * 两个明确：
 * 		返回值类型：boolean
 * 		参数列表：int a,int b
 */
public class Test19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数据");
		int num1 = sc.nextInt();
		System.out.println("请输入第二个数据");
		int num2 = sc.nextInt();
		
		boolean equal = getEqual(num1, num2);
		if (equal) {
            System.out.println("两个数据相等");
        } else {
            System.out.println("两个数据不相等");
        }
	}

    public static boolean getEqual(int num1, int num2) {
        // TODO Auto-generated method stub
        
        return num1 == num2;
    }
}
