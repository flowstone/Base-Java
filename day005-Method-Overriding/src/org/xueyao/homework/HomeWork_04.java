package org.xueyao.homework;

import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jun 29, 2017 11:49:04 PM
 */
public class HomeWork_04 {
    public static void main(String[] args) {
        /*
         * ������: �����������󣬲��ô���ʵ��
        1.����¼��һ������(�������߸���������,���Ƿ���λ������Ч������λ)
        2.����һ������,�÷����Ĺ����Ǽ���������Ǽ�λ����,����λ������
        3.��main�����д�ӡ�������Ǽ�λ��
        4.��ʾ��ʽ����:
            (1)��ʾһ:
                                    ������һ������:1234
                                    ����̨���:1234��4λ����
                                    
            (2)��ʾ��:
                                    ������һ������:-34567
                                    ����̨���:-34567��5λ����
                                    
            1234 /10 123/10  12/10  1/10    
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("������һ������");
        int number = sc.nextInt();
        int countDigit = numberDigit(number);
        System.out.println(number+"��"+countDigit+"λ����");
    }
    /**
     * @Description: TODO ���������Ǽ�λ����
     * @return: int
     */
    public static int  numberDigit(int number) {
         
         int count = 0;
         while (number != 0) {
             number = number / 10;
             count++;
             //System.out.println(number+"---------"+count);
        }
         return count;
         
         
    }
}
