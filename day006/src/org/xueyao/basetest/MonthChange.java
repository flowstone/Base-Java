package org.xueyao.basetest;

import java.util.Scanner;

/**
 * TODO ���󣺼���¼��һ���·ݣ�������·ݶ�Ӧ�ļ��ڡ�
 *      һ�����ļ�
 *      3,4,5   ����
 *      6,7,8   �ļ�
 *      9,10,11 �＾
 *      12,1,2  ����
 * 
 * ������
 *      A:����¼��һ���·�,��Scannerʵ��
 *      B:�жϸ��·��Ǽ���,�����·������Ӧ�ļ���
 *          if
 *          switch
 *
 * @author Yao Xue
 * @date Jun 30, 2017 5:53:39 PM
 */
public class MonthChange {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("����һ���·�(1-12)");
        int month = sc.nextInt();
        change(month);
    }
    
    public static void change(int month) {
        if (month > 0 && month <=12) {
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
        } else {
            System.out.println("��������ݴ���");
        }
    }
}
