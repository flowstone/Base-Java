package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * switch����ʽ��
 *      switch (���ʽ) {
 *          case ֵ1:
 *              ���1;
 *              break;
 *          case ֵ2:
 *              ���2;
 *              break;
 *          ...
 *          default:
 *              ���n+1;
 *              break;
 *      }
 *      
 *    ��ʽ���ͣ�
 *      ���ʽ�� byte,short,int ,char
 *          JDK5�Ժ������ö��
 *          JDK7�Ժ�������ַ���  
 */
public class SwitchDemo {
    public static void main(String[] args) {
        //����¼��1��2��..7����ֵ��ʹ��switch����ж������Ӧ������һ�����ڶ���..������
        
        Scanner sc = new Scanner(System.in);
        System.out.println("������1-7���ڵ���");
        int weekday = sc.nextInt();
        
        switch (weekday) {
        case 1:
            System.out.println("����һ");
            break;
        case 2:
            System.out.println("���ڶ�");
            break;
        case 3:
            System.out.println("������");
            break;
        case 4:
            System.out.println("������");
            break;
        case 5:
            System.out.println("������");
            break;
        case 6:
            System.out.println("������");
            break;
        case 7:
            System.out.println("������");
            break;
        default:
            System.out.println("����Ƿ�����");
            break;
        }
    }
}
