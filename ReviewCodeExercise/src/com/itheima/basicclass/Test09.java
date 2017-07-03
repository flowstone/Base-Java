package com.itheima.basicclass;

import java.util.Random;
import java.util.Scanner;

/*
 * 猜数字小游戏案例
 *		系统产生一个1-100之间的随机数，请猜出这个数据是多少。
 * 分析：
 * 		A:系统产生一个随机数1-100之间的。
 * 			int number = r.nextInt(100) + 1;
 * 		B:键盘录入我们要猜的数据
 * 			用Scanner实现
 *		C:比较这两个数据(用if语句)
 *			大了：给出提示大了
 *			小了：给出提示小了
 *			猜中了：给出提示，恭喜你，猜中了
 *		D:多次猜数据，而我们不知道要猜多少次，怎么办呢?
 *			while(true) {循环的内容}
 */
public class Test09 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Random r = new Random();
	    int number = r.nextInt(100)+1;
		while (true) {
		    System.out.println("请输入你要猜的数据");
		    int inputNum = sc.nextInt();
		    if (inputNum > number) {
		        System.out.println("您猜的数字有点大了");
		    } else if (inputNum < number) {
		        System.out.println("您输入的数字有点小了");
		    } else {
		        System.out.println("恭喜您猜对了");
		        break;
		    }
		}
	}
}
