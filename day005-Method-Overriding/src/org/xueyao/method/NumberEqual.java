package org.xueyao.method;

import java.util.Scanner;

/**
 * ����¼���������ݣ��Ƚ��������Ƿ����
 * @author Yao Xue
 * @date Jun 29, 2017 7:30:42 PM
 */
public class NumberEqual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("������һ������");
        int num1 = sc.nextInt();
        
        System.out.println("�������������");
        int num2 = sc.nextInt();
        
        boolean equal = compare(num1, num2);
        System.out.println(num1+"��"+num2+"�Ƿ���ȣ�"+equal);
        
    }
    
    /**
     * 
     * @Title: compare
     * @Description: TODO  �Ƚ��������Ƿ����
     * @param num1
     * @param num2
     * @return boolean
     */
    public static boolean compare(int num1, int num2) {
        if (num1 == num2) {
            return true;
        } else {
            return false;
        }
    }
}
