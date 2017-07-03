package com.itheima;

import java.util.Scanner;

/*
 * ������: �����������󣬲��ô���ʵ��
	1.����¼��10����������������
	2.����һ������������������������,ż������������Ҳ�
	3.����һ��������ӡԭ����ʹ���������
	4.����һ����������һ��int�������飬������������ֻ����һ�ε����ּ�����
 */
public class TestDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("�������" + (i + 1) + "�����֣�");
			arr[i] = sc.nextInt();
		}
		printArray(arr);
		arrayExchange(arr);
		printArray(arr);
		getSoleNumber(arr);
		sc.close();
	}

	/**
	 * ����ż������
	 * 
	 * @param arr
	 */
	public static void arrayExchange(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		int[] arrEvenNumber = new int[count];
		int[] arrOddNumber = new int[arr.length - count];
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				arrEvenNumber[count1] = arr[i];
				count1++;
			} else {
				arrOddNumber[count2] = arr[i];
				count2++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (i < arrOddNumber.length) {
				System.out.println(i);
				arr[i] = arrOddNumber[i];
			}else{
				System.out.println(i - arrOddNumber.length);
				arr[i] = arrEvenNumber[i - arrOddNumber.length];
			}
		}
	}

	/**
	 * �������
	 * 
	 * @param arr
	 */
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/**
	 * ��ӡ������ֻ����һ�ε�����
	 * 
	 * @param arr
	 */
	public static void getSoleNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (temp == arr[j] && j != i) {
					break;
				} else if (j == arr.length - 1) {
					System.out.print(temp + ", ");
				}
			}
		}
		System.out.println();
	}

}
