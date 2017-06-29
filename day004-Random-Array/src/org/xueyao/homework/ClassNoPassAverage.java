package org.xueyao.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jun 28, 2017 8:53:53 PM
 * ��һ�⣺�����������󣬲��ô���ʵ��
    1.����¼��༶����
    2.����¼��İ༶������������
    3.�������������0-100�ĳɼ�(����0��100)
    4.Ҫ��:
        (1)��ӡ�ð༶�Ĳ���������
        (2)��ӡ�ð༶��ƽ����
        (3)��ʾ��ʽ����:
            ������༶����:
            ����¼��:100
            ����̨���:
                ����������:19
                �༶ƽ����:87
 */
public class ClassNoPassAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("������༶������");
        //�Ӽ��̻�ȡ�༶����
        int classNumber = sc.nextInt();
        //���ݻ�ð༶������������
        int[] number = new int[classNumber];
        //
        int noPassCount = 0;
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            number[i] = r.nextInt(101);
            sum += number[i];
            if (number[i] < 60) {
                noPassCount++;
            } 
        }
        int classAvg = sum / classNumber;
        System.out.println("����������:"+noPassCount);
        System.out.println("�༶ƽ����:"+classAvg);
    }
}
