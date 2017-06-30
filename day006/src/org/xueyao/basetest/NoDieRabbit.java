package org.xueyao.basetest;
/**
 * ����
 *      ��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ�
 *      �������Ӷ��������ʵڶ�ʮ���µ����Ӷ���Ϊ���٣� 
 * 
 * ���ɣ�
 *      ��һ���£�1
 *      �ڶ����£�1
 *      �������£�2
 *      ���ĸ��£�3
 *      ������£�5
 *      ...
 * 
 *      ���ɣ��ӵ������¿�ʼ��ÿ���µ����Ӷ�����ǰ�����µ����Ӷ���֮��
 *          ��һ���º͵ڶ����µ����Ӷ�������1
 * 
 * ������
 *      A:�������ݱȽ϶�,�������ǾͶ���������ʵ����
 *          int[] arr = new int[20];
 *      B:�������Ԫ�ظ�ֵ
 *          arr[0] = 1
 *          arr[1] = 2
 *      C:�ҹ���
 *          arr[2] = arr[1] + arr[0];
 *          arr[3] = arr[2] + arr[1];
 *          arr[4] = arr[3] + arr[2];
 *          arr[5] = arr[4] + arr[3];
 *          ... 
 * @author Yao Xue
 * @date Jun 30, 2017 6:24:14 PM
 */
public class NoDieRabbit {
    public static void main(String[] args) {
        getRabbitCount();
    }
    
    public static void getRabbitCount() {
        int[] rabbit = new int[20];
        
        rabbit[0] = 1;
        rabbit[1] = 1;
        for (int i = 2; i < rabbit.length; i++) {
            rabbit[i] = rabbit[i-2] + rabbit[i-1];
        }
        
        System.out.println("�ڶ�ʮ���µ����Ӷ���"+rabbit[19]);

    }
}
