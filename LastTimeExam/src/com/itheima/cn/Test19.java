package com.itheima.cn;

import java.util.Scanner;

/**
 * ��.����11λ�� 
�ֻ������ÿһλ�������֡� 
���ݼ��������һ���ַ������͵��ֻ����룬�ж��ֻ�����ĺϷ��ԣ�Ҫ�� 
1.����ֻ����볤�Ȳ��Ϸ����ڿ���̨��ӡ��������Ȳ��Ϸ����糤�Ȳ��Ϸ��Ͳ��жϺ����������� 
2.����ֻ������а��������ֵ��ַ����ڿ���̨��ӡ��������Ƿ��ַ� 

3.����ֻ�������ϱ�׼��ʽ���ڿ���̨��ӡ������Ϸ����� 
 * @author Yao Xue
 * @date Jul 9, 2017 7:19:51 PM
 */
public class Test19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ���ֻ���");
        String number = sc.nextLine();
        if (number.length() != 11) {
            System.out.println("���Ȳ��Ϸ�");
            System.exit(0);
        } else {
           boolean flag = false;
           for (int i = 0; i < number.length(); i++) {
               if (number.charAt(i) <= 48 || number.charAt(i) >= 57) {
                   flag = true;
                   break;
               }
           }
           if (flag) {
               System.out.println("���Ƿ��ַ�");
           } else {
               System.out.println(number);
           }
        }
        
    }
}
