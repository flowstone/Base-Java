package com.itheima.flowconstrol;

import java.util.Scanner;

public class IfScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������ѧ���ɼ�");
        
        int studentScore = sc.nextInt();
        if (studentScore < 0 || studentScore > 100) {
            System.out.println("����ѧ���ɼ�����");
        } else {
            if (studentScore >= 90 && studentScore <= 100) {
                System.out.println("����");
            } else if (studentScore >= 80 && studentScore < 90) {
                System.out.println("��");
            } else if (studentScore >= 70 && studentScore <80) {
                System.out.println("��");
            } else if (studentScore >= 60 && studentScore <70) {
                System.out.println("����");
            } else {
                System.out.println("������");
            }
        }
        
    }
}
