package org.xueyao.operator_04;

/*
 * 逻辑运算符：用于连接关系表达式
 * &,|,^,!
 * &&,||
 * &  有false 则false
 * |  有true 则true
 * ^  相同则false,不同则true。举例：情侣关系。(男女)
 */
public class OperatorDemo {
	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		int c = 5;
		
		//&
		System.out.println((a>b) & (a>c));  // false & false
		System.out.println((a<b) & (a>c));  // true &  false
		System.out.println((a>b) & (a<c));  // false & true
		System.out.println((a<b) & (a<c));  // true &  true
		System.out.println("----------");
		
		//|
		System.out.println((a>b) | (a>c));  // false | false
		System.out.println((a<b) | (a>c));  // true |  false
		System.out.println((a>b) | (a<c));  // false | true
		System.out.println((a<b) | (a<c));  // true |  true
		System.out.println("---------");
		
		//^
		System.out.println((a>b) ^ (a>c));  // false ^ false
		System.out.println((a<b) ^ (a>c));  // true ^  false
		System.out.println((a>b) ^ (a<c));  // false ^ true
		System.out.println((a<b) ^ (a<c));  // true ^  true
		System.out.println("---------");
		
		//！
		System.out.println((a > b));
		System.out.println(!(a > b));
		System.out.println(!!(a > b));
	}
}
