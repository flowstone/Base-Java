package org.xueyao.basetest;

import java.util.Scanner;

/**
 *  ��������Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
 *(1)��������int[] arr = {5,7,3,2,5};
 *(2)Ҫ��ѯ��Ԫ��ͨ������¼��ķ�ʽȷ��
 *(3)����һ����������Ԫ�ص�һ�γ���λ�õķ���(ע,Ҫ���ҵ�Ԫ�ؾ��Ǽ���¼�������)
 *
 *������
 *      A:��������int[] arr = {5,7,3,2,5};
 *      B:����¼��һ������ѯ������
 *      C:д����ʵ�ֲ���ָ��Ԫ���������е�һ�γ��ֵ�����
 *          �������飬���αȽ�Ԫ�أ������ȣ��ͰѸô����������ؼ���
 *      D:���÷���,������
 *
 * @author Yao Xue
 * @date Jun 30, 2017 8:23:50 PM
 */
public class ArrayFindIndex {
    public static void main(String[] args) {
        int[] arr = {5,7,3,2,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ҫ��ѯ������");
        int value = sc.nextInt();
        int index = findIndex(arr, value);
        if (index >= 0) {
            System.out.println("��ѯ�����ݣ��±���"+index);
        } else {
            System.out.println("������û�в�ѯ������");
        }
    }
    
    public static int findIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
