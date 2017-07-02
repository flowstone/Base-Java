package com.itheima;

import java.util.Scanner;

/**
 * * ����
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
 *      ���ɣ��ӵ������¿�ʼ��ÿ���µ����Ӷ�����ǰ�����µ����Ӷ���֮�͡�
 *          ��һ���º͵ڶ����µ����Ӷ�����1
 * ������
 *      int[] arr = new int[20];
 * 
 *      arr[0] = 1;
 *      arr[1] = 1;
 * 
 *      arr[2] = arr[0] + arr[1];
 *      arr[3] = arr[1] + arr[2];
 *      arr[4] = arr[2] + arr[3];
 * @author Yao Xue
 * @date Jul 2, 2017 12:06:58 PM
 */
public class NoDieRabbit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("����������(�·�)");
        int month = sc.nextInt();
        if (month >= 2) {
            printRabbit(month);
            //--------�ݹ�---------
            //int num = recursionRabbit(month);
            //System.out.println(num);
        } else {
            System.out.println("������Ϸ�����");
        }
        
    }
    
    /**
     * @Description: TODO ���������ӡ����
     * @return: void
     */
    public static void printRabbit(int month) {
        int[] rabbit = new int[month];
        rabbit[0] = 1;
        rabbit[1] = 1;
        for (int i = 2; i < rabbit.length; i++) {
            rabbit[i] = rabbit[i-1] + rabbit[i-2];
        }
       
        
        System.out.println("��"+month+"���µ����Ӷ���Ϊ"+rabbit[month-1]);
    }
    
    /**
     * @Description: TODO ���õݹ�������ӵ�����
     * @return: int
     */
    public static int recursionRabbit(int month) {
        if (month == 1 || month == 2) {
            return 1;
        } else {
            return recursionRabbit(month-1) + recursionRabbit(month-2);
        }
    }
}
