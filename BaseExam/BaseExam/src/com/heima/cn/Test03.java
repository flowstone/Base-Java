package com.heima.cn;
/*
 * 3 . 
����һ���������飬����Ԫ��{1,3,4,7,8}����ȡ����������Ǳ�Ͷ�Ӧ��Ԫ�ض�Ϊż����Ԫ������������ڿ���̨��ӡ�����
 */
public class Test03 {
	public static void main(String[] args) {
		int[] arr = {1,3,4,7,8};
		int count = 0;
		for (int i = 0; i < arr.length; i=i+2) {
			if (arr[i] % 2 == 0) {
				System.out.println(arr[i]);
				count++;
			}
		}
		System.out.println("����Ϊ"+count);
	}
}
