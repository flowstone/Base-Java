package org.xueyao.newhomework;
/**
 * 
�ڶ��⣺�����������󣬲��ô���ʵ��
    ��1-500֮����ͬʱ��2��5��7��������������Ҫ�� 1 �� ��ӡ 5����
 * @author Yao Xue
 * @date Jul 2, 2017 9:08:42 PM
 */
public class HomeWork_02 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0 && i % 5 == 0 && i % 7 == 0) {
                count++;
                System.out.print(i+" ");
                if (count == 5) {
                    System.out.println();
                }
                
            }
        }
    }
}
