package org.xueyao.flowcontrol;
/*
 * ͳ��ˮ�ɻ����ĸ���
 */
public class WhileDaffodilCount {
    public static void main(String[] args) {
        
        int count = 0;
        int i = 100;
        while (i <= 999) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            if (i == (ge*ge*ge + shi*shi*shi + bai*bai*bai)) {
                count++;
            }
            i++;
        }
        System.out.println("ˮ�ɻ����ĸ���Ϊ"+count);
    }
}
