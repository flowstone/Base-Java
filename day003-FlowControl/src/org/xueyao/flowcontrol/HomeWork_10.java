package org.xueyao.flowcontrol;

import java.util.Scanner;

/*
 * ��ʮ��:�����������󣬲��ô���ʵ�֣�
    1.����¼��ѧ���ɼ�(��������),���¼��ĳɼ�Ϊ-1��ʾ¼�����
    2.��ӡ���¼���ѧ���ɼ���ƽ��ֵ
    
    ����:
        �޷��ж�ѭ������,ֻ��ѡ��while����do{}while();
   ��¼��ɼ�Ϊ-1��¼������� if����ж��û��Ƿ�����-1������-1������whileѭ�� 
 */
public class HomeWork_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        double sum = 0;
        while (true) {
            System.out.println("�������"+(i+1)+"��ѧ���ɼ�");
            double studenScore = sc.nextDouble();
            if (studenScore == -1) {
                System.out.println("¼�����");
                break;
            }
           
            sum += studenScore;
            i++;
        }
        double avg = sum / i;
        System.out.println("��������"+i+"ѧ���ĳɼ�,���ǳɼ�ƽ����Ϊ"+avg);
    }
}
