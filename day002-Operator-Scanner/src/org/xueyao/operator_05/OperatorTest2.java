package org.xueyao.operator_05;

/* 
 * ��ȡ���������е����ֵ
 */
public class OperatorTest2 {
	public static void main(String[] args) {
		int a = 50;
		int b = 70;
		int c = 80;
		
		int temp = (a > b)?a:b;
		int max = (temp > c)?temp:c;
		System.out.println("����������������"+max);
	}
}
