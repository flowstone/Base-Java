package com.itheima.basicclass;
/*
 * 写一个方法，用于求和。 两个明确： 返回值类型 int 参数列表 int a,int b
 */
public class Test17 {
	public static void main(String[] args) {
		int sum = getSum(4,5);
		System.out.println("sum:"+sum);
	}

    public static int getSum(int i, int j) {
        // TODO Auto-generated method stub
        return i+j;
    }
}
