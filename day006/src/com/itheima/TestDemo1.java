package com.itheima;

import java.util.Scanner;

/*
 * 第五题: 分析以下需求，并用代码实现
	1.键盘录入10个整数存入数组中
	2.定义一个方法将奇数放在数组的左侧,偶数放在数组的右侧
	3.定义一个方法打印原数组和处理后的数组
	4.定义一个方法传入一个int类型数组，输出这个数组中只出现一次的数字及个数
 */
public class TestDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			System.out.println("请输入第" + (i + 1) + "个数字：");
			arr[i] = sc.nextInt();
		}
		printArray(arr);
		arrayExchange(arr);
		printArray(arr);
		getSoleNumber(arr);
		sc.close();
	}

	/**
	 * 奇数偶数交换
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
	 * 数组遍历
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
	 * 打印数组中只出现一次的数字
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
