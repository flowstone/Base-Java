package com.itheima.cn;

import java.util.Scanner;

/**
 *
 *��������1��С��1000�����������������Ӧ�Ĵ�д��ʽ����д�������£� 
"��","Ҽ","��","��","��","��","½","��","��","��" 
��ʾ��ʽ���£� 
�������11111       �������123      �������12          �������1 
������Ľ��Ϸ���                                            Ҽ����                                            Ҽ��                                              Ҽ 
 * @author Yao Xue
 * @date Jul 9, 2017 5:31:17 PM
 */
public class Test14 {
    public static void main(String[] args) {
        String[] str = {"��","Ҽ","��","��","��","��","½","��","��","��" };
        Scanner sc = new Scanner(System.in);
        System.out.println("1��С��1000�����������");
        int price = sc.nextInt();
        
        if (price >=1000) {
            System.out.println("������Ľ��Ϸ��� ");
        } else {
            int ge = price % 10;
            int shi = price / 10 % 10;
            int bai = price / 10 / 10 % 10;
            if (bai == 0 && shi != 0) {
                System.out.println(str[shi]+str[ge]);
            }else if (bai == 0 && shi == 0) {
                System.out.println(str[ge]);
            } else {
                System.out.println(str[bai]+str[shi]+str[ge]);
            }
        }
    }
}
