package com.itheima;

public class TestDemo {
	public static void main(String[] args) {
		int[] arr = {2,3,3,2,1,6,1,9,4,4,5,7,7};
		getSoleNumber(arr);
	}

	private static void getSoleNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			for (int j = 0; j < arr.length; j++) {
				if (temp == arr[j] && j!=i) {
					break;
				}else if (j == arr.length - 1) {
					System.out.print(temp+", ");
				}
			}
		}
	}
}
