package com.itheima.homework;

import java.util.Scanner;

/*
 * 第一题:分析以下需求，并用代码实现
	1.键盘录入一个三位整数数，请分别获取该三位数上每一位的数值
	2.例如：键盘录入的整数123的个位、十位、百位，分别是3、2、1
	3.打印格式:"数字123的个位是 3, 十位是 2, 百位是 1"
 */
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个三位整数");
		int num = sc.nextInt();
		int ge = num %10;
		int shi = num/10%10;
		int bai = num/100%10;
		System.out.println("数字"+num+"的个位是"+ge+", 十位是 "+shi+", 百位是"+bai);
		
	}
}
