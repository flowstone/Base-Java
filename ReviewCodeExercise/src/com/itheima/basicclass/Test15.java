package com.itheima.basicclass;
/*
 * ��ά�������
 * 
 * System.out.println():������ݲ�����
 * System.out.print():�������
 * System.out.println():����
 */
public class Test15 {
	public static void main(String[] args) {
		int[][] arr = new int[10][10];
		for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j+1+i;
            }
        }
		
		for (int i = 0; i < arr.length; i++) {
		    System.out.print("[");
            for (int j = 0; j < arr[i].length; j++) {
                if (j == arr[i].length-1) {
                    System.out.print(arr[i][j]+"]");
                } else {
                    System.out.print(arr[i][j]+", ");
                }
            }
            System.out.println();
        }
	}
}
