package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * if����ʽ3��
 *      if (��ϵ���ʽ1) {
 *          �����1;
 *      } else if (��ϵ���ʽ2) {
 *          �����2;
 *      } else if (��ϵ���ʽ3) {
 *          �����3;
 *      }
 *      ...
 *        else {
 *           �����n+1;
 *        }
 */
public class IfDemo3 {
    public static void main(String[] args) {
        System.out.println("��ʼ");
        
        /*
         * ����¼��һ��������ʹ��if����ж�xȡֵ��Χ
            x��y�Ĺ�ϵ�������£�
                x>=3        y = 2x + 1;
                -1<=x<3 y = 2x;
                x<=-1       y = 2x �C 1;
                            ���ݸ�����x��ֵ�������y��ֵ�������

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ������");
        int x = sc.nextInt();
        int y ;
        
        if (x >= 3) {
            y = 2 * x + 1;
        } else if (x >= -1 && x < 3) {
            y = 2 * x;
        } else if (x <= -1) {
            y = 2 * x - 1;
        } else {
            y = 0;
            System.out.println("������������x");
        }
        
        System.out.println("y:"+y);
        
        System.out.println("����");
    }
}
