package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * �����⣺�����������󣬲��ô���ʵ�֣�
    1.����������ģ����������ܣ��Լ���¼�������int���͵����ݽ��мӡ������ˡ��������㣬����ӡ������
    2.Ҫ��
        (1)����¼����������,����ǰ������������μ���������ݣ�
            ����������ΪҪ���е�����(0:��ʾ�ӷ�����,1:��ʾ��������,2:��ʾ�˷�����,3:��ʾ��������)
        (2)ʹ�ý�����ѧ֪ʶ��ɹ���
        (3)��ʾ��ʽ����:
            �������һ������:30
            ������ڶ�������:40
            ��������Ҫ���е�����(0:��ʾ�ӷ�����,1:��ʾ��������,2:��ʾ�˷�����,3:��ʾ��������):0
            ����̨���:30+40=70
 */
public class HomeWork_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("�������һ������:");
        int num1 = sc.nextInt();
        System.out.println("������ڶ�������:");
        int num2 = sc.nextInt();
        System.out.println("��������Ҫ���е�����(0:��ʾ�ӷ�����,1:��ʾ��������,2:��ʾ�˷�����,3:��ʾ��������):");
        int operator = sc.nextInt();
        
        switch (operator) {
        case 0:
            System.out.println(num1+"+"+num2+"="+(num1+num2));
            break;
        case 1:
            System.out.println(num1+"-"+num2+"="+(num1+num2));
            break;
        case 2:
            System.out.println(num1+"*"+num2+"="+(num1+num2));
            break;
        case 3:
            System.out.println(num1+"/"+num2+"="+(num1+num2));
            break;
        default:
            System.out.println("������Ƿ�����,����������");
            break;
        }
    }
}
