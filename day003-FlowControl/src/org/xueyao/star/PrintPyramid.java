package org.xueyao.star;

import java.util.Scanner;

/*
 * ��ӡ�����Ρ�������������
 */
public class PrintPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("���������ɽ������Ĳ���");
        int n = sc.nextInt();
        /*
                  ʵ��������
             *     1    1
            ***    3    1+2
           *****   5    1+2+2
       */
        for (int i = 1; i <= n; i++) {
            //���ƿո�
            for (int k = 1; k <= n-i; k++) {
                System.out.print(" ");
            }
            //��������
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            //���ƻ���
            System.out.println();
        }
        
        
        System.out.println("--------��г�ָ���-------");
        /*����������
                
                *
               * *
              *****
            
            */
         for (int i = 1; i<= n; i++) {
             for (int j = 1; j <= n - i; j++) {
                 System.out.print(" ");
             }
             for (int k = 1; k <= i*2-1; k++) {
                 if (k == 1 || k == i*2-1 || i == n) {
                     System.out.print("*");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
         System.out.println("--------��г�ָ���-------");

         /*
       ��������
        *****
         ***
          *
      */
         for (int i = n; i >= 1; i--) {
             //���ƿո�
             for (int k = 1; k <= n-i; k++) {
                 System.out.print(" ");
             }
             //��������
             for (int j = 1; j <= i*2-1; j++) {
                 System.out.print("*");
             }
             //���ƻ���
             System.out.println();
         }
         
         
         System.out.println("--------��г�ָ���-------");
         
         /*
         �����Ľ�����
          *****
           * *
            *
        */    
         for (int i = n; i >= 1; i--) {
             for (int j = 1; j <= n - i; j++) {
                 System.out.print(" ");
             }
             for (int k = 1; k <= i*2-1; k++) {
                 if (k == 1 || k == i*2-1 || i == n) {
                     System.out.print("*");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
         System.out.println("--------��г�ָ���-------");
        /*
        ʵ������
         *
        ***
       *****
        ***
         *
     */
         for (int i = 1; i <= n; i++) {
             //���ƿո�
             for (int k = 1; k <= n-i; k++) {
                 System.out.print(" ");
             }
             //��������
             for (int j = 1; j <= i*2-1; j++) {
                 System.out.print("*");
             }
             //���ƻ���
             System.out.println();
         }
         for (int i = n-1; i >= 1; i--) {
             //���ƿո�
             for (int k = 1; k <= n-i; k++) {
                 System.out.print(" ");
             }
             //��������
             for (int j = 1; j <= i*2-1; j++) {
                 System.out.print("*");
             }
             //���ƻ���
             System.out.println();
         }
         System.out.println("--------��г�ָ���-------");

        
        
        /*
        ʵ������
         *
        * *
       *   *
        * *
         *
     */
         for (int i = 1; i<= n; i++) {
             for (int j = 1; j <= n - i; j++) {
                 System.out.print(" ");
             }
             for (int k = 1; k <= i*2-1; k++) {
                 if (k == 1 || k == i*2-1) {
                     System.out.print("*");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
         for (int i = n-1; i >= 1; i--) {
             for (int j = 1; j <= n - i; j++) {
                 System.out.print(" ");
             }
             for (int k = 1; k <= i*2-1; k++) {
                 if (k == 1 || k == i*2-1 || i == n) {
                     System.out.print("*");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
    }
}
