package org.xueyao.operator;

/*
 * ++,--
 */
public class OperatorDemo4 {
	public static void main(String[] args) {
		
		int a = 10;
		System.out.println("a:"+a);
		System.out.println("--------");
		
		//++
		//a++;
		//System.out.println("a:"+a);
		
		
		//���������Ĳ���
		//int b = a;
		/*
		int b = a++;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		*/
		
		int b = ++a;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("---------");
		
	}
}
