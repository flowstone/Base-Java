package com.itheima.basicclass;
/*
 * дһ�������������е�ˮ�ɻ�����ӡ�ڿ���̨
 * 
 * ������ȷ��
 * 		����ֵ���ͣ�void
 * 		�����б��޲���
 */
public class Test23 {
	public static void main(String[] args) {
		printPower();
	}

    public static void printPower() {
        // TODO Auto-generated method stub
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            if (ge*ge*ge+shi*shi*shi+bai*bai*bai == i) {
                System.out.println(i);
            }
        }
    }
}
