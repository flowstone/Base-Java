package org.xueyao;

import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 1, 2017 7:15:04 PM
 */
public class Test_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
           System.out.println("������һ����������");
           int score = sc.nextInt();
           if (score > 100 || score < 0) {
               System.out.println("¼��ɼ�����");
               break;
           } else {
               if (score >= 90 && score <= 100) {
                   System.out.println("A��");
               } else if (score >= 80 && score <= 89) {
                   System.out.println("B��");
               } else if (score >= 70 && score <=79) {
                   System.out.println("C��");
               } else if (score >= 60 && score <= 69) {
                   System.out.println("D��");
               } else {
                   System.out.println("E��");
               }
           }
        }
    }
}
