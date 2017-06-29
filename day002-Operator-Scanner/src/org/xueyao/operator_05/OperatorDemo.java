package org.xueyao.operator_05;

/*
 * 三元运算符：
 * 		关系表达式?表达式1：表达式2
 * 
 */
public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int c = (a > b)?a:b;
		System.out.println("c:"+c);
	}
}
