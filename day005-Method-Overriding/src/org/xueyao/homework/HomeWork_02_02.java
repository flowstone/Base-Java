package org.xueyao.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jun 29, 2017 10:38:39 PM
 */
public class HomeWork_02_02 {
    public static void main(String[] args) {
        /*
         *  �ڶ��⣺�����������󣬲��ô���ʵ��
            1.��day04��ҵ�е�һ��͵ڶ����д������鼰������Ԫ�ص�ֵ��ֵ�Ĳ�����װ�ɷ���
            2.Ȼ����day04��ҵ�е�һ��͵ڶ����е���ĿҪ���װ������ɹ���
         * �ڶ��⣺�����������󣬲��ô���ʵ��
            1.�����࿼��Ҫ���з���,����¼��ð༶�ܹ�������?�Լ�ÿ���ѧ������?
            2.����¼���������ÿ��ѧԱ������������ά����
            3.�������������0-100�ĳɼ�(����0��100)
            4.Ҫ��:
                (1)��ӡ�ð༶��ÿ��Ĳ���������
                (2)��ӡ�ð༶��ÿ���ƽ����
                (3)��ӡ������ƽ����
                (4)��ӡ�༶�еĲ���������
                (5)��ӡ�༶ƽ����
                (6)��ʾ��ʽ����:
                                ������༶������:3
                                ������༶��ÿ�������:10
                                ����̨���:
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
        
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("������༶������:");
        int groupNumber = sc.nextInt();
        
        System.out.print("������༶��ÿ�������:");
        int groupStudenNumber = sc.nextInt();
        
        int[][] studentScore = createStudentScore(groupNumber, groupStudenNumber);
        studentScore = StudentScoreAssignment(studentScore);
        //ÿ��Ĳ���������
        int[] groupNoPassNumber = createGroupNoPassNumber(groupNumber);
        groupNoPassNumber = groupNoPassNumber(groupNoPassNumber, studentScore);
        //ÿ���ƽ���� 
        int[] groupAverage = creategroupAverage(groupNumber);
        groupAverage = groupAverage(groupAverage, studentScore);
        int groupAverageMax = groupAverageMax(groupAverage);
        
        int classNoPassNumber = classNoPassNumber(groupNoPassNumber);
        
        int classAverage = classAverage(studentScore, groupNumber, groupStudenNumber);
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
        printInfo(groupNoPassNumber, groupAverage, groupAverageMax, classNoPassNumber, classAverage);
        
    }
    
    public static int[][] createStudentScore(int groupNumber, int groupStudenNumber ) {
        int[][] studentScore = new int[groupNumber][groupStudenNumber];
        return studentScore;
    }
    
    
    public static int[][] StudentScoreAssignment(int[][] studentScore) {
        Random r = new Random();
        for (int i = 0; i < studentScore.length; i++) {
            for (int j = 0; j < studentScore[i].length; j++) {
                studentScore[i][j] = r.nextInt(100);
                System.out.print(studentScore[i][j]+" "); //������
            }
            System.out.println();////������
        }
        System.out.println("----------");
        return studentScore;
    }
    
    public static int[] createGroupNoPassNumber(int groupNumber) {
        int[] groupNoPassNumber = new int[groupNumber];
        return groupNoPassNumber;
    }
    
    public static int[] creategroupAverage(int groupNumber) {
        int[] groupAverage = new int[groupNumber];
        return groupAverage;
    }
    
  //ÿ��Ĳ���������
    public static int[]  groupNoPassNumber(int[] groupNoPassNumber, int[][] studentScore) {
        for (int i = 0; i < studentScore.length; i++) {
            int temp = 0;
            for (int j = 0; j < studentScore[i].length; j++) {
                if (studentScore[i][j] < 60) {
                    temp++;
                }
            }
            groupNoPassNumber[i] = temp;
        }
        return groupNoPassNumber;
    }
    
    //ÿ��ƽ����
    public static int[] groupAverage(int[] groupAverage, int[][] studentScore) {
        for (int i = 0; i < studentScore.length; i++) {
            int temp = 0;
            for (int j = 0; j < studentScore[i].length; j++) {
                temp += studentScore[i][j];
            }
            //ÿ���ƽ���� 
            groupAverage[i] = temp / studentScore[i].length;
        }
        return groupAverage;
    }
  //������ƽ����
    public static int groupAverageMax(int[] groupAverage) {
        
        int groupAverageMax = groupAverage[0];
        for (int i = 1; i < groupAverage.length; i++) {
            if (groupAverage[i] > groupAverageMax) {
                groupAverageMax = groupAverage[i];
            }
        }
        return groupAverageMax;
    }
  //�༶�еĲ���������
    public static int classNoPassNumber(int[] groupNoPassNumber) {
        int classNoPassNumber = 0;
        for (int i = 0; i < groupNoPassNumber.length; i++) {
            classNoPassNumber += groupNoPassNumber[i];
        }
        return classNoPassNumber;
    }
  //�༶ƽ����
    public static int classAverage(int[][] studentScore, int groupNumber, int groupStudenNumber) {
        int classAverage = 0;
        for (int i = 0; i < studentScore.length; i++) {
            int temp = 0;
            for (int j = 0; j < studentScore[i].length; j++) {
                temp += studentScore[i][j];
            }
            
            classAverage += temp;
        }
        classAverage = classAverage / (groupNumber * groupStudenNumber);
        return classAverage;
    }
    
    //�����Ϣ
    public static void printInfo(int[] groupNoPassNumber, int[] groupAverage, int groupAverageMax, int classNoPassNumber, int classAverage) {
        for (int i = 0; i < groupNoPassNumber.length; i++) {
            System.out.println("��"+(i+1)+"�鲻��������Ϊ: "+groupNoPassNumber[i]+" ��");
            
            System.out.println("��"+(i+1)+"��ƽ����Ϊ: "+groupAverage[i]);
        }
        System.out.println("�༶�е������ƽ����Ϊ:"+groupAverageMax);
        System.out.println("�༶�в���������Ϊ: "+classNoPassNumber+" ��");
        System.out.println("�༶��ƽ����Ϊ: "+classAverage);
    }
    
 
    
}
