package com.itheima.basicclass;
/*
 * whileѭ����ϰ
 * ��1-100֮�͡�
 * ��ϰ��ͳ��ˮ�ɻ�������
 */
public class Test08 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		while (i<=100) {
            sum += i;
            i++;
        }
		System.out.println("sum:"+sum);
		
		int j = 100;
		int count = 0;
		while (j <= 999) {
		    int ge = j % 10;
		    int shi = j / 10 % 10;
		    int bai = j / 10 / 10 %10;
		    if (ge*ge*ge+shi*shi*shi+bai*bai*bai == j) {
                count++;
            }
		    j++;
		}
		System.out.println("ˮ�ɻ�����"+count);
	}
}
