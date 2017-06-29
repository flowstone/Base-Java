package org.xueyao.operator;

/*
 * 运算符：就是用于对常量和变量进行操作的符号
 * 
 *  运算符分类：
 *  	算术运算符
 *  	赋值运算符
 *  	关系运算符
 *  	逻辑运算符
 *  	三元运算符
 *  
 *  算术运算符
 *   +，-，*，/，%，++，--
 */
public class OperatorDemo {

	public static void main(String[] args) {
		int a = 3;
		int b = 4;

		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);

		System.out.println(3.0 / b);
		System.out.println(a / 4.0);

	}

}
