package org.xueyao.homework;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jun 29, 2017 10:34:50 PM
 */
public class HomeWork_02_01 {
    public static void main(String[] args) {
        /*
         * �ڶ��⣺�����������󣬲��ô���ʵ��
            1.��day04��ҵ�е�һ��͵ڶ����д������鼰������Ԫ�ص�ֵ��ֵ�Ĳ�����װ�ɷ���
            2.Ȼ����day04��ҵ�е�һ��͵ڶ����е���ĿҪ���װ������ɹ���
            ----------------------------------------
                                ��һ�⣺�����������󣬲��ô���ʵ��
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
            ------------------------------------------

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("������༶������");
        //�Ӽ��̻�ȡ�༶����
        int classNumber = sc.nextInt();
        int[] number = createNumber(classNumber);
        numberAssignment(number);
       
        System.out.println("����������:"+noPassCount(number));
        System.out.println("�༶ƽ����:"+classAvg(number));
    }
    /**
     * @Description: TODO  �����༶��������
     * @return: int[]
     */
    public static int[] createNumber(int classNumber){
      //���ݻ�ð༶������������
        int[] number = new int[classNumber];
        return number;
    }
    /**
     * @Description: TODO  �����ʼ��
     * @return: void
     */
    public static void numberAssignment(int[] number) {
        Random r = new Random();
        for (int i = 0; i < number.length; i++) {
            number[i] = r.nextInt(101);
        }
    }
    
    /**
     * @Description: TODO  �����������
     * @return: int
     */
    public static int noPassCount(int[] number) {
        int noPassCount =0;
        for (int i = 0; i < number.length; i++) {
            if (number[i] < 60) {
                noPassCount++;
            }
        }
        return noPassCount;
    }
    
    /**
     * @Description: TODO  �༶����
     * @return: int
     */
    public static int classAvg(int[] number) {
        int sum =0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        return sum / number.length;
    }
    
    
}
