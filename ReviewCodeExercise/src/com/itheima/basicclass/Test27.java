package com.itheima.basicclass;
/*
 * ����дһ�����������ڶ����������ͣ������÷�����
 */
public class Test27 {
	public static void main(String[] args) {
	    int[] arr =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = getSum(arr);
		System.out.println("sum:"+sum);
	}

    public static int getSum(int[] arr) {
        // TODO Auto-generated method stub
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += i;
        }
        return sum;
    }
}
