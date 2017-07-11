package com.heima.cn;

import java.util.Scanner;

/*
 * 2 . 模拟注册用户，按照以下要求实现相关功能：
    a.	提示用户在控制台输入手机号码，并接收。	  
    b.	判断该手机号码是否是11位，是否都是数字，其余可以不做判断，如果不符合任意一项，则提示用户“注册用户失败”。
    c.	将手机号的后四位获取出来输出到控制台上。  
 */
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个手机号码");
		String number = sc.nextLine();
		boolean flag = false;
		if (number.length() == 11) {
			char[] ch = number.toCharArray();
			for (int i = 0; i < ch.length; i++) {
				if (ch[i] <'0' ||ch[i] >'9') {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("注册用户失败");
			} else {
				System.out.println("手机后四位："+ number.substring(7,11));
			}
		} else {
			System.out.println("注册用户失败");
		}
		
		
		
	}
}
