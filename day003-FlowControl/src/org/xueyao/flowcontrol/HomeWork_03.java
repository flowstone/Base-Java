package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * �����⣺�����������󣬲��ô���ʵ�֣�
    1.���ݹ���(����)��Ա���ǹ���(����),����ͻ�������ͨ������¼��
    2.�ǹ��ʵ��������£�
        [10-15)     +5000
        [5-10)      +2500
        [3~5)       +1000
        [1~3)       +500
        [0~1)       +200
    3.����û�����Ĺ���Ϊ10����������Ϊ3000���������к��ӡ��ʽ"��Ŀǰ������10�꣬��������Ϊ 3000Ԫ, Ӧ�ǹ��� 5000Ԫ,�Ǻ��� 8000Ԫ"
 */
public class HomeWork_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("���������Ĺ���(��λ:��)");
        int year = sc.nextInt();
        System.out.println("���������Ļ�������(��λ:Ԫ)");
        int baseSalary = sc.nextInt();
        //��ʼ���Ǻ���
        int lastSalary = 0;
        if (year < 0 || baseSalary <= 0) {
            System.out.println("������Ĺ���������������,����������");
        } else {
            if (year >=10 && year <15) {
                lastSalary = baseSalary + 5000;
            } else if (year >= 5 && year < 10) {
                lastSalary = baseSalary + 2500;
            } else if (year >= 3 && year < 5) {
                lastSalary = baseSalary + 1000;
            } else if (year >=1 && year < 3) {
                lastSalary = baseSalary + 500;
            } else {
                lastSalary = baseSalary + 200;
            }
        }
        System.out.println("��Ŀǰ������"+year+"�꣬��������Ϊ "
                +baseSalary+"Ԫ, Ӧ�ǹ��� "+(lastSalary-baseSalary)
                +"Ԫ,�Ǻ��� "+lastSalary+"Ԫ");
        
        
    }
}
