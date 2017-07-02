package com.itheima;

import java.util.Scanner;

/**
 * 
 * 
 * ���󣺼���¼��һ���·ݣ�������·ݶ�Ӧ�ļ��ڡ�
 *      һ�����ļ�
 *      3,4,5   ����
 *      6,7,8   �ļ�
 *      9,10,11 �＾
 *      12,1,2  ����
 * 
 * ������
 *      A:����¼��һ���·�,��Scannerʵ��
 *      B:�жϸ��·��Ǽ��£������·������Ӧ�ļ���
 *          if
 *          switch
 *
 * @author Yao Xue
 * @date Jul 2, 2017 11:39:50 AM
 */
public class MonthDebug {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������·�");
        int month = sc.nextInt();
        
        printMonth(month);
    }

    public static void printMonth(int month) {
        if (month <= 0 || month > 12) {
            System.out.println("�����·ݴ���");
        } else {
            switch (month) {
            case 3:
            case 4:    
            case 5:
                System.out.println("����");
                break;
            case 6:
            case 7:    
            case 8:
                System.out.println("�ļ�");
                break;
            case 9:
            case 10:    
            case 11:
                System.out.println("�＾");
                break;
            default:
                System.out.println("����");
                break;
            }
        }
    }
}
