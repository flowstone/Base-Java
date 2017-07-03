package com.itheima.basicclass;

import java.util.Scanner;

public class Test01 {
	//键盘录入两个数据，获取这两个数据的较大值
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 > num2) {
            System.out.println("最大值是:"+num1);
        } else {
            System.out.println("最小值是："+num2);
        }
	}
}
