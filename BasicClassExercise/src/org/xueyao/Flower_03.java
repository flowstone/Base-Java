package org.xueyao;
/**
 * ������3��
��Ŀ����ӡ�����е�"ˮ�ɻ���"����ν"ˮ�ɻ���"��ָһ����λ����
���λ���������͵��ڸ�������

 * @author Yao Xue
 * @date Jul 1, 2017 5:04:51 PM
 */
public class Flower_03 {
    public static void main(String[] args) {
        getFlower();
    }
    
    public static void getFlower() {
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            
            if (i == (ge*ge*ge + shi*shi*shi + bai*bai*bai)) {
                System.out.println("ˮ�ɻ�����"+i);
            }
        }
    }
}
