package org.xueyao.operator;

/*
 * +: ���ӷ�����
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
		
		//�ַ�����ӷ�����
		char c = 'A';
		System.out.println(a + c);
		
		//�ַ�������ӷ�����
		System.out.println("HelloWorld"+a+b);
		System.out.println(a+b+"HelloWorld"+a+b);
	}

}
