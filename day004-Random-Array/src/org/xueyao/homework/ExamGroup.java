package org.xueyao.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jun 28, 2017 9:10:25 PM
 * �ڶ��⣺�����������󣬲��ô���ʵ��
    1.�����࿼��Ҫ���з���,����¼��ð༶�ܹ�������?�Լ�ÿ���ѧ������?  //groupNumber   //groupStudenNumber
    2.����¼���������ÿ��ѧԱ������������ά����
    3.�������������0-100�ĳɼ�(����0��100)  //studentScore
    4.Ҫ��:
        (1)��ӡ�ð༶��ÿ��Ĳ���������   //groupNoPassNumber  ���
        (2)��ӡ�ð༶��ÿ���ƽ����      //groupAverage         ���
        (3)��ӡ������ƽ����        //groupAverageMax         ���
        (4)��ӡ�༶�еĲ���������   //classNoPassNumber       ���
        (5)��ӡ�༶ƽ����        //classAverage            ���
        (6)��ʾ��ʽ����:
            ������༶������:3
            ������༶��ÿ�������:10
           
 */
public class ExamGroup {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("������༶������:");
        int groupNumber = sc.nextInt();
        
        System.out.print("������༶��ÿ�������:");
        int groupStudenNumber = sc.nextInt();
        
        int[][] studentScore = new int[groupNumber][groupStudenNumber];
        for (int i = 0; i < studentScore.length; i++) {
            for (int j = 0; j < studentScore[i].length; j++) {
                studentScore[i][j] = r.nextInt(100);
                System.out.print(studentScore[i][j]+" "); //������
            }
            System.out.println();////������
        }
        System.out.println("----------");
        //ÿ��Ĳ���������
        int[] groupNoPassNumber = new int[studentScore.length];
        //ÿ���ƽ���� 
        int[] groupAverage = new int[studentScore.length];
        
        
        //�༶ƽ����
        int classAverage = 0;
        
        for (int i = 0; i < studentScore.length; i++) {
            int tempNoPassNumber = 0; //��ʱ����鲻��������
            int tempGroupSum = 0; //��ʱ�������ܷ�
            
            for (int j = 0; j < studentScore[i].length; j++) {
               if (studentScore[i][j] < 60) {
                   tempNoPassNumber++;
               }
               //ÿ����ܷ�
               tempGroupSum += studentScore[i][j];
            }
           //ÿ���ƽ���� 
            groupAverage[i] = tempGroupSum / groupStudenNumber;
            //ÿ��Ĳ���������
            groupNoPassNumber[i] = tempNoPassNumber;
            //�洢�༶�ܷ�
            classAverage += tempGroupSum;
        }
        //�༶ƽ����
        classAverage = classAverage / (groupNumber * groupStudenNumber);
        
        
        //������ƽ����
        int groupAverageMax = groupAverage[0];
        for (int i = 1; i < groupAverage.length; i++) {
            if (groupAverage[i] > groupAverageMax) {
                groupAverageMax = groupAverage[i];
            }
        }
        
        
      //�༶�еĲ���������
        int classNoPassNumber = 0;
        for (int i = 0; i < groupNoPassNumber.length; i++) {
            classNoPassNumber += groupNoPassNumber[i];
        }
        
        /*
         *  ����̨���:
                                    ��1�鲻��������Ϊ: 6 ��
                                    ��1��ƽ����Ϊ: 52
                                    ��2�鲻��������Ϊ: 7 ��
                                    ��2��ƽ����Ϊ: 46
                                    ��3�鲻��������Ϊ: 3 ��
                                    ��3��ƽ����Ϊ: 69
                                    �༶�е������ƽ����Ϊ:69
                                    �༶�в���������Ϊ: 16 ��
                                    �༶��ƽ����Ϊ: 56
         */
        for (int i = 0; i < groupNoPassNumber.length; i++) {
            System.out.println("��"+(i+1)+"�鲻��������Ϊ: "+groupNoPassNumber[i]+" ��");
            
            System.out.println("��"+(i+1)+"��ƽ����Ϊ: "+groupAverage[i]);
        }
        System.out.println("�༶�е������ƽ����Ϊ:"+groupAverageMax);
        System.out.println("�༶�в���������Ϊ: "+classNoPassNumber+" ��");
        System.out.println("�༶��ƽ����Ϊ: "+classAverage);
    }
}
