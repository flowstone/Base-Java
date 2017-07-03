package com.itheima.basicclass;
/*
 * 需求：统计”水仙花数”共有多少个
 * 
 * 分析：
 * 		A:定义统计变量，初始化值是0
 * 		B:获取三位数，用for循环实现
 * 		C:获取三位数的个位，十位，百位
 * 		D:判断这个三位数是否是水仙花数，如果是，统计变量++
 * 		E:输出统计结果就可以了
 */
public class Test07 {
	public static void main(String[] args) {
	    int count = 0;
	    for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            if (ge*ge*ge+shi*shi*shi+bai*bai*bai == i) {
                System.out.println(i);
                count++;
            }
        }
	    System.out.println("水仙花数有"+count);
	}
}
