package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * ����¼��ѧ�����Գɼ������ݳɼ��жϸ�ѧ�������ĸ�����
     90-100������90��100��      ����
     80-90������80������90��    ��
     70-80 ������70������80��   ��
     60-70 ������60������70��   ����
     60������ ��������60��       ������
 */
public class IfScoreLevelDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ��ѧ���Ŀ��Գɼ�(����)");
        int studentScore = sc.nextInt();
        
        if (studentScore >=0 && studentScore <= 100) {
            if (studentScore >= 90 && studentScore <= 100) {
                System.out.println("����");
            } else if (studentScore >= 80 && studentScore < 90) {
                System.out.println("��");
            } else if (studentScore >= 70 && studentScore < 80) {
                System.out.println("��");
            } else if (studentScore >=60 && studentScore < 70) {
                System.out.println("����");
            } else if (studentScore < 60) {
                System.out.println("������");
            }
        } else {
            System.out.println("�������ѧ�����Գɼ�����");
        }
         
        
      
    }
}
