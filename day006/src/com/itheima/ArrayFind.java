package com.itheima;

import java.util.Scanner;

/**
 * *��������Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
 *(1)��������int[] arr = {5,7,3,2,5};
 *(2)Ҫ��ѯ��Ԫ��ͨ������¼��ķ�ʽȷ��
 *(3)����һ����������Ԫ�ص�һ�γ���λ�õķ���(ע,Ҫ���ҵ�Ԫ�ؾ��Ǽ���¼�������)
 *
 *������
 *      A:��������int[] arr = {5,7,3,2,5};
 *      B:Ҫ��ѯ��Ԫ��ͨ������¼��ķ�ʽȷ��
 *      C:����һ����������Ԫ�ص�һ�γ���λ�õķ���
 *          �������飬��ȡ��ÿһ��Ԫ�أ����бȽϣ������ȣ���ֱ�ӰѸô����������ء�
 *      D:���÷�����������
 * @author Yao Xue
 * @date Jul 2, 2017 1:14:41 PM
 */
public class ArrayFind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,7,3,2,5};
        System.out.println("������Ҫ��ѯ��Ԫ��");
        int findNumber = sc.nextInt();
        int index = FindNumber(arr, findNumber);
        if (index == -1) {
            System.out.println("û���ҵ���Ԫ��");
        } else {
            System.out.println("�ҵ���Ԫ��������"+index);
        }
        
    }
    
    public static  int  FindNumber(int[] arr, int findNumber) {
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == findNumber) {
                return i;
            }
        }
        return -1;
    }
}
