package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * �����⣺�����������󣬲��ô���ʵ�֣�           
    1.��������:����¼���·ݣ������Ӧ�ļ���
    2.Ҫ��:
        (1)����¼��һ������(�����·�,��Χ1-12)
        (2)������·ݶ�Ӧ�ļ���
            3,4,5����
            6,7,8�ļ�
            9,10,11�＾
            12,1,2����
        (3)��ʾ��ʽ����:
            ������һ���·�:3
            ����̨���:3�·��Ǵ���
 */
public class HomeWork_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ������(�����·�,��Χ1-12)");
        int month = sc.nextInt();
        
        switch (month) {
        case 3:
        case 4:
        case 5:
            System.out.println(month+"�·��Ǵ���");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println(month+"�·����ļ�");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println(month+"�·����＾");
            break;
        case 12:
        case 1:
        case 2:
            System.out.println(month+"�·��Ƕ���");
            break;
        default:
            System.out.println("������Ƿ�����,����������");
            break;
        }
    }
}
