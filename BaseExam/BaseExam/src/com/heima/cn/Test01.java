package com.heima.cn;
/*
 * javaEE13期   89号  薛尧
 * 1 . 
main方法中定义3个变量：int a = 5, b = 3, c = 8;
并依次完成以下要求：
  1). 利用if语句求出a、b、c中最大的数并打印到控制台上；
  2).  利用三元运算符求出a、b、c中最小的数并打印到控制台上；
         (20分)
 */
public class Test01 {
	public static void main(String[] args) {
		int a = 5, b = 3, c = 8;
		int max =0;
		if (a > b ) {
			max = a;
		} else {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		
		System.out.println("max:"+max);
		int min = a < b ? a : b;
		min = min < c ? min : c;
		System.out.println("min:"+min);
	}
}
