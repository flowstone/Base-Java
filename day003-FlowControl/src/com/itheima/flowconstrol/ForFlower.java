package com.itheima.flowconstrol;

/*
 * ˮ�ɻ���
 */
public class ForFlower {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            
            if (i == ge*ge*ge + shi*shi*shi + bai*bai*bai) {
                count++;
                System.out.println(i);
            }
        }
        System.out.println("ˮ�ɻ����ĸ����У�"+count+" ��");
    }

}
