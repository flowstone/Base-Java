package com.itheima.cn;

import java.util.Scanner;

/**
 * �Զ���һ����������ķ�������ʾ�û�����һ��double���͵�С��������÷����У�ͨ���ж�С������һλ���ֵĴ�С��������������������
    PS�� ����ʹ��Math����ط���
 * @author Yao Xue
 * @date Jul 9, 2017 8:46:13 AM
 */
public class Test09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("��������һ��double���͵�С��");
        
        double number = sc.nextDouble();
        int lastNumber = (int) (number + 0.5);
        System.out.println("�������룺"+lastNumber);
    }
}
