package com.itheima.cn;

import java.util.Random;

/**
 * һ. �������10��1-10֮�����������1��10����
 * �����ɵ����ŵ������У�
 * ��������������Ϊ������Ԫ��ƽ��ֵ�����������ӡ������
 * @author Yao Xue
 * @date Jul 9, 2017 6:40:37 PM
 */
public class Test17 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10)+1;
            //System.out.println(arr[i]);
        }
        int sum = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i=i+2) {
            sum += arr[i];
            count++;
        }
        System.out.println(sum / count);
    }
}
