package org.xueyao.method;

import java.util.Scanner;

/**
 * ����¼���������ݣ������������е����ֵ
 * @author Yao Xue
 * @date Jun 29, 2017 7:37:08 PM
 */
public class NumberThreeMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("�������һ������");
        int num1 = sc.nextInt();
        
        System.out.println("������ڶ�������");
        int num2 = sc.nextInt();
        
        System.out.println("���������������");
        int num3 = sc.nextInt();
        
        int max = getMax(num1, num2, num3);
        System.out.println("�������������ǣ�"+max);
    }
    
    /**
     * 
     * @Title: getMax
     * @Description: TODO  �������е����ֵ
     * @param num1
     * @param num2
     * @param num3
     * @return int
     */
    public static int getMax(int num1, int num2, int num3) {
        if (num1 > num2) {
            if (num1 > num3) {
                return num1;
            } else {
                return num3;
            }
        } else {
            if (num2 > num3) {
                return num2;
            } else {
                return num3;
            }
        }
    }
}
