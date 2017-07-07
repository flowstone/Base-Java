package com.itheima.homework.teacher;

import java.util.Scanner;

/*
 * 第三题: 分析以下需求,并用代码实现
	1.键盘录入一个源字符串由字符串变量scrStr接收
	2.键盘录入一个要删除的字符串由字符串变量delStr接收
	3.要求
		删除该字scrStr符串中的所有delStr字符串（最终的字符串中不能包含delStr），要求打印删除后的结果以及删除了几个delStr字符串
	4.代码运行打印格式:
		请输入源字符串:java woaijava,i like jajavava i enjoy java
		请输入要删除的字符串:java
		控制台输出结果:源字符串中总共包含:5 个 java 删除java后的字符串为: woai,i like  i enjoy
		
		
		java woaijava,i like jajavava i enjoy java
		1: woaijava,i like jajavava i enjoy java
		2:woai与后面的,i like jajavava i enjoy java重新生成woai,i like jajavava i enjoy java
		3：woai,i like ja与后面的va i enjoy java重新生成woai,i like java i enjoy java
		4：woai,i like 与后面的 i enjoy java重新生成woai,i like  i enjoy java
		5：woai,i like  i enjoy 与后面的""重新生成woai,i like  i enjoy 
		
		
 */
public class Test_03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个大字符串");
		String str = sc.nextLine();
		System.out.println("请输入一个小字符串");
		String str1 = sc.nextLine();
		getNum(str, str1);
	}
	
	
	public static void getNum(String str, String str1) {
		int length;
		int count = 0;
		while ((length = str.indexOf(str1)) >= 0) {
			StringBuilder sb = new StringBuilder();
			sb.append(str.substring(0, length));
			sb.append(str.substring(length + str1.length()));
			str = sb.toString();
			count++;
		}
		System.out.println("源字符串中总共包含:"+count+" 个 java 删除java后的字符串为:"+str);
	}
}
