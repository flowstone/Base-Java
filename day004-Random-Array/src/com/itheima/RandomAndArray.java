package com.itheima;

import java.util.Random;

/**
 * @author Yao Xue
 * @date Jun 29, 2017 4:44:27 PM
 */
public class RandomAndArray {
    public static void main(String[] args) {
        /*
         * ����һ��20-50֮��������,����������������ĳ���
         * Ȼ��������飬���θ����鸳ֵ����ֵ��������33-99֮��������
         * ��������ӡ����
         */
        Random r = new Random();
        
        int number = r.nextInt(31) + 20;
        System.out.println("�������������"+number);
        int[] arr = new int[number];
        
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(67) + 33;
            System.out.print(arr[i]+" ");
        }
    }
}
