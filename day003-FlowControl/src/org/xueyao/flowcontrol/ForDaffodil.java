package org.xueyao.flowcontrol;
/*
 * ��ӡ100-999֮���ˮ�ɻ��� 
 * ����ж�һ�����Ƿ���ˮ�ɻ���
 * 153 = 1*1*1 + 5*5*5 + 3*3*3;
 */
public class ForDaffodil {
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            
            if (i == (ge*ge*ge + shi*shi*shi + bai*bai*bai)) {
                System.out.println(i+"��ˮ�ɻ���");
            }
        }
    }
}
