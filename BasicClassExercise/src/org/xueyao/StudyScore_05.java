package org.xueyao;

import java.util.Scanner;

/**
 * ������5��
��Ŀ�����ù�ϵ�������Ƕ������ɴ��⣺
ѧϰ�ɼ�>=90�ֵ�ͬѧ��A��ʾ��60-89��֮�����B��ʾ��
60�����µ���C��ʾ��

 * @author Yao Xue
 * @date Jul 1, 2017 6:15:39 PM
 */
public class StudyScore_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������ѧϰ�ɼ���");
        int score = sc.nextInt();
        scoreLevel(score);
    }
    
    public static void scoreLevel(int score) {
        if (score <0 || score > 100) {
            System.out.println("�������ݴ���");
        } else {
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 60 && score <= 89) {
                System.out.println("B");
            } else {
                System.out.println("C");
            }
        }
    }
}
