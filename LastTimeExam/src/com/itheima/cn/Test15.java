package com.itheima.cn;

import java.util.Scanner;

/**
 * //�Զ���һ����������ķ�������ʾ�û�����һ��double���͵�С��������÷����У�
//ͨ���ж�С������һλ���ֵĴ�С�������������������� 
//
//PS�� ����ʹ��Math����ط��� 
 * @author Yao Xue
 * @date Jul 9, 2017 6:24:34 PM
 */
public class Test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������С��");
        double number = sc.nextDouble();
        int number2 = (int) (number + 0.5);
        System.out.println("�������룺"+number2);
    }
}
