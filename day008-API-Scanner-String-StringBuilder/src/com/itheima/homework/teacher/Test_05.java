package com.itheima.homework.teacher;

import java.util.Random;

/*
 * 第五题: 分析以下需求,并用代码实现
	1.定义String getStr(char[] chs)方法
		功能描述：获取长度为5的随机字符串，字符串由随机的4个大写英文字母和1个0-9之间（包含0和9）的整数组成
	2.定义main方法，方法内完成：
		(1)定义长度为26，元素值为26个大写英文字母的数组chs
		(2)传递数组chs调用getStr(char[] chs)方法，获取返回值,并在控制台打印返回值
 */
public class Test_05 {
	public static void main(String[] args) {
		char[] ch = getChar();
		printArray(ch);
		System.out.println(getStr(ch));
	}

	public static void printArray(char[] ch) {
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i] + " ");
		}
		System.out.println();
	}

	public static char[] getChar() {
		char[] ch = new char[26];
		for (int i = 0; i < ch.length; i++) {
			ch[i] = (char) (65 + i);
		}
		return ch;
	}

	// 功能描述：获取长度为5的随机字符串，字符串由随机的4个大写英文字母和1个0-9之间（包含0和9）的整数组成
	public static String getStr(char[] chs) {
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		for (int i = 0; i < 4; i++) {
			int nextInt = random.nextInt(26);
			sb.append(chs[nextInt]);
		}
		int nextInt = random.nextInt(10);
		sb.insert(random.nextInt(5), nextInt);
		return sb.toString();
	}
	
	//GJGF
}
