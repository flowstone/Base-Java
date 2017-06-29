package org.xueyao.operator;

/*
 * +: 做加法运算
 *  'A'  65
 *  'a'  90
 *  '0'  48
 * */
public class OperatorDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 7;
		System.out.println(a + b);
		System.out.println("---------");
		
		//字符参与加法运算
		char c = 'A';
		System.out.println(a + c);
		
		//字符串参与加法运算
		System.out.println("HelloWorld"+a+b);
		System.out.println(a+b+"HelloWorld"+a+b);
	}

}
