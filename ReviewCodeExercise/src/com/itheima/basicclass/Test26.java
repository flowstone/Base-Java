package com.itheima.basicclass;
/*
 * ���󣺰ѻ�ȡ������ֵ�Ľ�Ϊ����ʵ�֣������÷���
 */
public class Test26 {
	public static void main(String[] args) {
	    int[] arr = {2, 2, 3, 1, 5, 6, 7, 8, 9, 10};
	    arr = getNum(arr);
	    System.out.println("���ֵ�ǣ�"+arr[0]);
	    System.out.println("��Сֵ�ǣ�"+arr[1]);
	}

    public static int[] getNum(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
            arr[0] = max;
            arr[i] = min;
        }
       
        return arr;
    }
}
