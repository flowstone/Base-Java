package org.xueyao.random;

import java.util.Random;
import java.util.Scanner;

/*
 * Random:���ڲ��������
 * 
 * ʹ�ò���
 *  A������
 *      import java.util.Random
 *  B:��������
 *      Random r = new Random();
 *  C:��������
 *      int number = r.nextInt(10);
 *      ��ȡ���ݵķ�Χ��[0,10)����0��������10
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        
        int number = r.nextInt(10);
        System.out.println("��õ������Ϊ"+number);
        
        //forѭ��
        for (int i = 1; i <= 10; i++) {
            int number1 = r.nextInt(10);
            System.out.println("Random:"+number1);
        }
        System.out.println("-----------");
        
        //����ȡ1-100֮��������
        int i = r.nextInt(100)+1;
        System.out.println("i:"+i);
        
    }
}
