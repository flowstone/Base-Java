package com.itheima.homework;

import java.util.Scanner;

/*
 * 第三题:分析以下需求，并用代码实现
	1.键盘录入一个学生成绩(int类型)
	2.判断该学生成绩是否及格
	3.打印格式：
		成绩>=60:打印"合格"
		成绩<60:打印"不合格"
 */
public class StudentScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个学生成绩(int类型)");
		int score = sc.nextInt();
		System.out.println(score>=60?"合格":"不合格");
	}
}
