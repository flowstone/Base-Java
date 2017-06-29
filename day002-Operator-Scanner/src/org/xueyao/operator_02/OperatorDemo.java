package org.xueyao.operator_02;
/*
 * 赋值运算符
 * 			基本的赋值运算符 =
 * 			扩展的赋值运算符 +=，-=，*=，/=，...
 */
public class OperatorDemo {
	public static void main(String[] args) {
		int a = 10;
		
		//+=
		a += 20;
		System.out.println("a:"+a);
		
		//注意： 扩展的赋值运算符，隐含了强制类型转换
		short s = 1;
		s += 1;
		System.out.println(s);
	}
}
