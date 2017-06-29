package org.xueyao.operator_03;

/*
 * 关系运算符：	
 * 		==,!=,>,>=,<,<=
 */
public class OperatorDemo {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 10;
		
		//==
		System.out.println(a==b);
		System.out.println(a==c);
		System.out.println("-------");
		
		//!=
		System.out.println(a!=b);
		System.out.println(a!=c);
		System.out.println("-------");
		
		//>
		System.out.println(a > b);
		System.out.println(a > c);
		System.out.println("-------");
		
		//>=
		System.out.println(a >= b);
		System.out.println(a >= c);
		System.out.println("-------");
		
		//<
		System.out.println(a < b);
		System.out.println(a < c);
		System.out.println("-------");
		
		//<=
		System.out.println(a <= b);
		System.out.println(a <= c);
		System.out.println("-------");
		
		//注意事项
		System.out.println(a == b);
		System.out.println(a = b);
	}
}
