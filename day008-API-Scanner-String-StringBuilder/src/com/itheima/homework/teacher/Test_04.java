package com.itheima.homework.teacher;

import java.util.Scanner;

/*
 * 第四题: 分析以下需求,并用代码实现
	1.键盘录入一个字符串
	2.将该字符串变成字符数组(不能使用toCharArray()方法)
	3.将字符数组中的所有大写字母变成小写字母(不能使用toLowerCase()方法)
	4.如果第一位和最后一位的内容不相同,则交换
	5.将字符数组中索引为偶数的元素变成'~'
	6.打印数组元素的内容
 */
public class Test_04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个字符串");
		String str = sc.nextLine();
		char[] chs = getChar(str);
		char[] newChar = getNewChar(chs);
		printArray(newChar);
		char[] char1 = getChar(chs);
		printArray(char1);
		char[] evenChar = getEvenChar(chs);
		printArray(evenChar);
	}
	
	//数组遍历
	private static void printArray(char[] chs) {
		for (int i = 0; i < chs.length; i++) {
			System.out.print(chs[i]);
		}
		System.out.println();
	}
	//将该字符串变成字符数组(不能使用toCharArray()方法)
		/*
		 * 返回值类型 	char[]
		 * 参数列表	String str
		 */
	public static char[] getChar(String str){
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
		}
		return ch;
	}
	
	//3.将字符数组中的所有大写字母变成小写字母(不能使用toLowerCase()方法)'A'  65   'a'  97   97 - 65 = 32
	
	/*
	 * 返回值类型	char[]
	 * 参数列表	char[] chs
	 */
	
	public static char[] getNewChar(char[] chs){
		for (int i = 0; i < chs.length; i++) {
			if ( 'A'  <= chs[i] && chs[i]<= 'Z') {
				chs[i] = (char) (chs[i] + 32);
			}
		}
		return chs;
	}
	
	
	//如果第一位和最后一位的内容不相同,则交换
	/*	返回值类型	char[]
	 * 	参数列表char[] chs
	 */
	public static char[] getChar(char[] chs){
		char temp = 0;
		if (chs[0] != chs[chs.length - 1] ) {
			temp = chs[0];
			chs[0] = chs[chs.length - 1];
			chs[chs.length - 1] = temp;
		}
		return chs;
	}
	
	//5.将字符数组中索引为偶数的元素变成'~'
	
	/*	
	 * 	返回值类型	char[]
	 * 	参数列表char[] chs
	 */
	public static char[] getEvenChar(char[] chs){
		for (int i = 0; i < chs.length; i++) {
			if (i % 2 == 0) {
				chs[i] = '~';
			}
		}
		return chs;
	}
	
}








