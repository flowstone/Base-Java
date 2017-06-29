package org.xueyao.scanner;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		//创建键盘录入对象
		Scanner sc = new Scanner(System.in);
		
		//接收数据 
		System.out.println("请输入一个数据：");
		int i = sc.nextInt();
		
		//输出结果
		System.out.println("i:"+i);
	}
}
