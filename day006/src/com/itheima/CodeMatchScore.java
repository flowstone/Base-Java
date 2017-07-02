package com.itheima;

import java.util.Scanner;

/**
 * �����ڱ�̾����У���6����ίΪ������ѡ�ִ�֣�����Ϊ0-100�������֡�
 * ѡ�ֵ����÷�Ϊ��ȥ��һ����߷ֺ�һ����ͷֺ� ����4��ѡ�ֵ�ƽ��ֵ��
 * ��д����ʵ�֡�(������С������)
 * 
 * ������
 *      A:����һ������Ϊ6�����顣
 *      B:ͨ������¼��ķ�ʽ������ί�ķ���
 *      C:д����ʵ�ֻ�ȡ�����е����ֵ����Сֵ
 *      D:д����ʵ������Ԫ�ص����
 *      E:ƽ���֣� (��-��߷�-��ͷ�)/(arr.length-2)
 *      F:�����������
 * @author Yao Xue
 * @date Jul 2, 2017 12:50:29 PM
 */
public class CodeMatchScore {
    public static void main(String[] args) {
        int[] score = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            System.out.println("���"+(i+1)+"λ��ί��ѡ�ִ��,����Ϊ0-100��������");
            score[i] = sc.nextInt();
        }
        
        int max = getMax(score);
        
        int min = getMin(score);
        
        int sum = getSum(score);
        
        int avg = (sum - max - min) / (score.length-2);
        System.out.println("ѡ��ƽ������"+avg);    
        
    }

    public static int getSum(int[] score) {
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return sum;
    }

    public static int getMin(int[] score) {
        int min = score[0];
        for (int i = 0; i < score.length; i++) {
           
            if (min > score[i]) {
                min = score[i];
            }
        }
        return min;
    }

    public static int getMax(int[] score) {
        int max = score[0];
        for (int i = 0; i < score.length; i++) {
            if (max < score[i]) {
                max = score[i];
            }
        }
        return max;
    }
}
