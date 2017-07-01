package org.xueyao;

import java.util.Scanner;

/**
 *������1��
 *��Ŀ���ŵ����⣺��һ�����ӣ��ӳ������3������ÿ���¶���һ�����ӣ�С���ӳ����������º�ÿ��������һ�����ӣ�
 *�������Ӷ���������ÿ���µ����Ӷ���Ϊ���٣� 
 * ����         ���Ӷ���
 * 1     1
 * 2     1 
 * 3     2
 * 4     3
 * 5     5
 * 6     8
 * @author Yao Xue
 * @date Jul 1, 2017 1:00:02 PM
 */
public class RabbitCount_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������·�");
        int month = sc.nextInt();
        rabbit(month);
    }
    
    public static void rabbit(int month) {
        int[] arr = new int[month];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
           arr[i] = arr[i-1] + arr[i-2];
        }
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("��"+(i+1)+"��-------��"+arr[i]+"������");
        }
    }
}
