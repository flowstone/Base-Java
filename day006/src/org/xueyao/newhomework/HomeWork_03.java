package org.xueyao.newhomework;

import java.util.Random;

/**
 * ������:�����������󣬲��ô���ʵ��
    ����һ������Ϊ10�����飬������Ԫ��Ϊ������ɵ� 1-100֮����������������������
 * @author Yao Xue
 * @date Jul 2, 2017 9:09:12 PM
 */
public class HomeWork_03 {
    public static void main(String[] args) {
        printArray(10);
    }

    public  static void printArray(int i) {
        // TODO Auto-generated method stub
        int[] arr = new int[i];
        Random r = new Random();
        for (int j = 0; j < arr.length; j++) {
            arr[j] = r.nextInt(100)+1;
        }
        System.out.print("[");
        for (int j = 0; j < arr.length; j++) {
            if (j == arr.length-1) {
                System.out.print(arr[j]+"]");
            } else {
                System.out.print(arr[j]+", ");
            }
        }
    }
}
