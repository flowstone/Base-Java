package org.xueyao;

import java.util.Scanner;

/**
 * ���Գɼ��ֵȼ�������ݼ�������ĳɼ��������Ӧ�ĳɼ��ȼ���Ҫ��
    1.����¼��һ����������
    2���¼���������0~100������0��100��֮�����һֱ¼�벢���ݼ���¼��ĳɼ��������Ӧ�ĳɼ��ȼ�; �����¼�����������0~100������0��100��֮��ͽ�������¼�룬����ʾ�ɼ�¼�����
    �ɼ��ȼ���ʾ���£�
        90~100  A�ȡ�
        80~89   B�ȡ�
        70~79   C�ȡ�
        60~69   D�ȡ�
        60~0    E�ȡ�
        С��0���ߴ���100  �ɼ�¼�����

 * @author Yao Xue
 * @date Jul 1, 2017 7:15:04 PM
 */
public class Test_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
           System.out.println("������һ����������");
           int score = sc.nextInt();
           if (score > 100 || score < 0) {
               System.out.println("¼��ɼ�����");
               break;
           } else {
               if (score >= 90 && score <= 100) {
                   System.out.println("A��");
               } else if (score >= 80 && score <= 89) {
                   System.out.println("B��");
               } else if (score >= 70 && score <=79) {
                   System.out.println("C��");
               } else if (score >= 60 && score <= 69) {
                   System.out.println("D��");
               } else {
                   System.out.println("E��");
               }
           }
        }
    }
}
