package org.xueyao.method;

import java.util.Scanner;

/**
 * ����¼���������ݣ������������еĽϴ�ֵ
 * @author Yao Xue
 * @date Jun 29, 2017 7:16:14 PM
 */
public class NumberMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("�������һ������");
        int num1 = sc.nextInt();
        
        System.out.println("������ڶ�������");
        int num2 = sc.nextInt();
        
        int max = getMax(num1, num2);
        System.out.println("����������������"+max);
    }
    
    /**
     * 
     * @Title: getMax
     * @Description: TODO ����������нϴ�ֵ
     * @param num1
     * @param num2
     * @return int
     */
    public static int getMax(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
       
    }

}
