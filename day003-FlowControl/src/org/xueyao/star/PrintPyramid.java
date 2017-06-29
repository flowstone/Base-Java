package org.xueyao.star;

import java.util.Scanner;

/*
 * 打印三角形、金字塔、菱形
 */
public class PrintPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入生成金字塔的层数");
        int n = sc.nextInt();
        /*
                  实心三角形
             *     1    1
            ***    3    1+2
           *****   5    1+2+2
       */
        for (int i = 1; i <= n; i++) {
            //控制空格
            for (int k = 1; k <= n-i; k++) {
                System.out.print(" ");
            }
            //控制星星
            for (int j = 1; j <= i*2-1; j++) {
                System.out.print("*");
            }
            //控制换行
            System.out.println();
        }
        
        
        System.out.println("--------和谐分割线-------");
        /*空心三角形
                
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
         System.out.println("--------和谐分割线-------");

         /*
       倒金字塔
        *****
         ***
          *
      */
         for (int i = n; i >= 1; i--) {
             //控制空格
             for (int k = 1; k <= n-i; k++) {
                 System.out.print(" ");
             }
             //控制星星
             for (int j = 1; j <= i*2-1; j++) {
                 System.out.print("*");
             }
             //控制换行
             System.out.println();
         }
         
         
         System.out.println("--------和谐分割线-------");
         
         /*
         倒空心金字塔
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
         System.out.println("--------和谐分割线-------");
        /*
        实心菱形
         *
        ***
       *****
        ***
         *
     */
         for (int i = 1; i <= n; i++) {
             //控制空格
             for (int k = 1; k <= n-i; k++) {
                 System.out.print(" ");
             }
             //控制星星
             for (int j = 1; j <= i*2-1; j++) {
                 System.out.print("*");
             }
             //控制换行
             System.out.println();
         }
         for (int i = n-1; i >= 1; i--) {
             //控制空格
             for (int k = 1; k <= n-i; k++) {
                 System.out.print(" ");
             }
             //控制星星
             for (int j = 1; j <= i*2-1; j++) {
                 System.out.print("*");
             }
             //控制换行
             System.out.println();
         }
         System.out.println("--------和谐分割线-------");

        
        
        /*
        实心菱形
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
