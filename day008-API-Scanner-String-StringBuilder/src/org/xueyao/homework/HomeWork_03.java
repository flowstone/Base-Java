package org.xueyao.homework;

import java.util.Scanner;

/**
 * ������: ������������,���ô���ʵ��
    1.����¼��һ��Դ�ַ������ַ�������scrStr����
    2.����¼��һ��Ҫɾ�����ַ������ַ�������delStr����
    3.Ҫ��
        ɾ������scrStr�����е�����delStr�ַ��������յ��ַ����в��ܰ���delStr����Ҫ���ӡɾ����Ľ���Լ�ɾ���˼���delStr�ַ���
    4.�������д�ӡ��ʽ:
        ������Դ�ַ���:java woaijava,i like jajavava i enjoy java
        ������Ҫɾ�����ַ���:java
        ����̨������:Դ�ַ������ܹ�����:5 �� java ɾ��java����ַ���Ϊ: woai,i like  i enjoy
        
 * @author Yao Xue
 * @date Jul 5, 2017 4:31:00 PM
 */
public class HomeWork_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("������һ��Դ�ַ���");
        String scrStr = sc.nextLine();
        System.out.println("�����Ҫɾ�����ַ���");
        String delStr = sc.nextLine();
        
        String[] split = scrStr.split(delStr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            //System.out.println(split[i]);
            sb.append(split[i]);
        }
        System.out.println("Դ�ַ������ܹ�����:"+(split.length)+" �� "+delStr+" ɾ��"+delStr+"����ַ���Ϊ:"+sb);
        

    }
}
