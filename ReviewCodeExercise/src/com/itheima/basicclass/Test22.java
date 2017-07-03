package com.itheima.basicclass;
/*
 * 需求：写一个方法，传递一个整数(大于1)，在控制台打印1到该数据的值。
 * 
 * 两个明确：
 * 		返回值类型：void
 * 		参数列表：int n
 */
public class Test22 {
	public static void main(String[] args) {
		printN(10);
	}

    public static void printN(int i) {
        // TODO Auto-generated method stub
        for (int j = 1; j <= i; j++) {
            System.out.println(j);
        }
    }
}
