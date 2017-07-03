package com.itheima.basicclass;
/*
 * 需求：求出1-100之间偶数和
 * 
 * 分析：
 * 		A:定义求和变量，初始化值是0
 * 		B:获取1-100之间的数据，用for循环实现
 * 		C:把获取到的数据进行判断，看是否是偶数
 * 			如果是，就累加
 * 		D:输出求和结果
 */
public class Test05 {
	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
		System.out.println("sum:"+sum);
	}
}
