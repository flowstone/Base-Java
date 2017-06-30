package org.xueyao.homework;

import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jun 29, 2017 11:48:16 PM
 */
public class HomeWork_03 {
    public static void main(String[] args) {
        /*
         * �����⣺�����������󣬲��ô���ʵ��
        1.����¼�볤���εĳ��Ϳ�
                        ���巽������ó����ε��ܳ�,����main�����д�ӡ�ܳ�
        2.����¼�볤���εĳ��Ϳ�
                        ���巽������ó����ε����,����main�����д�ӡ���
        3.����¼��Բ�İ뾶
                        ���巽�������Բ���ܳ�,����main�����д�ӡ�ܳ�
        4.����¼��Բ�İ뾶
                        ���巽�������Բ�����,����main�����д�ӡ���
         */
        
        Scanner sc = new Scanner(System.in);
        System.out.println("�����볤���εĳ�");
        double length = sc.nextDouble();
        System.out.println("�����볤���εĿ�");
        double width = sc.nextDouble();
        System.out.println("�ó����ε��ܳ�Ϊ"+rectanglePerimeter(length, width));
        System.out.println("�ó����ε����Ϊ"+rectangleArea(length, width));
        
        System.out.println("������Բ�İ뾶");
        double radius = sc.nextDouble();
        System.out.println("��Բ�ĵ��ܳ�Ϊ"+circlePerimeter(radius));
        System.out.println("��Բ�ĵ����Ϊ"+circleArea(radius));
    }
    
    public static double rectanglePerimeter(double length, double width) {
        return (length + width) * 2;
    }
    
    public static double rectangleArea(double length, double width) {
        return length * width;
    }
    
    public static double circlePerimeter(double radius) {
        return 2 * radius * 3.14;
    }
    
    public static double circleArea(double radius) {
        return radius * radius * 3.14;
    }
}
