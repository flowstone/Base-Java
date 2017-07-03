package com.itheima.basicclass;
/*
 * 需求：求出1-5之间数据之和
 * 
 * 分析：
 * 		A:定义求和变量，初始化值是0
 * 		B:获取1-5之间的数据，用for循环实现
 * 		C:把每一次获取到的数据，累加起来就可以了
 * 		D:输出求和变量即可
 */
public class Test04 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
            sum += i;
        }
		
		System.out.println("sum:"+sum);
	}
}
