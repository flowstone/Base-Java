package org.xueyao.flowcontrol;
/*
 * �ڰ���:�����������󣬲��ô���ʵ�֣�
    1.���մӴ�С��˳�������λ���еĸ�λ+��λ=ʮλ+ǧλ(3553,2332,1166,8228,3773)�����ּ�����
    2.ÿ�����5����������������֮���ÿո�ָ�
    3.�磺9999 9988 9977 9966 9955 
 */
public class HomeWork_08 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 9999; i >= 1000; i--) {
            //�ֱ�ȡ����λ��ʮλ����λ��ǧλ
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            int qian = i / 10 / 10 / 10 % 10;
            
            if (ge + bai == shi + qian) {
                count++;
                System.out.print(i+" ");
                //һ������5�����ֻ���
                if (count % 5 == 0) {                 
                    System.out.println();
                }
            }
        }
    }
}
