package org.xueyao.homework;

import java.util.Random;

/**
 * ������:�����������󣬲��ô���ʵ��
    1.������������Ϊ10�����飬������Ԫ��Ϊ������ɵġ����ظ��� 1-100֮���������
    2.����һ�������������������飬�����н��������鲻ͬ��Ԫ��ƴ�ӳ�һ���ַ��������ҽ����ַ����Լ��ַ����ĳ������������̨�ϣ�
        ���û�������"�Բ����������������Ԫ�ؾ���ͬ"
 * @author Yao Xue
 * @date Jul 1, 2017 9:34:39 PM
 */
public class HomeWork_05 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];
        //������Ԫ��Ϊ������ɵġ����ظ��� 1-100֮�������
        arr1[0] = r.nextInt(100)+1;
        for (int i = 0; i < arr1.length; ) {
            int temp = r.nextInt(100)+1;;
            //System.out.println("------"+temp);
            for (int j = 0; j < arr1.length; j++) {
                if (temp == arr1[j] && j!=i) {
                    break;
                } else if (j == arr1.length - 1) {
                    arr1[i] = temp;
                    i++;
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        System.out.println("---------");
        arr2[0] = r.nextInt(100)+1;
        for (int i = 0; i < arr2.length; ) {
            int temp = r.nextInt(100)+1;;
            //System.out.println("------"+temp);
            for (int j = 0; j < arr2.length; j++) {
                if (temp == arr2[j] && j!=i) {
                    break;
                } else if (j == arr2.length - 1) {
                    arr2[i] = temp;
                    i++;
                }
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i]+" ");
        }
        
        
        //����һ�������������������飬�����н��������鲻ͬ��Ԫ��ƴ�ӳ�һ���ַ��������ҽ����ַ����Լ��ַ����ĳ������������̨��
        arraySplice(arr1,arr2);
    }

    public static void arraySplice(int[] arr1, int[] arr2) {
        // TODO Auto-generated method stub
        
    }
}
