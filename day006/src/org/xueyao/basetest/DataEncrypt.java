package org.xueyao.basetest;

import java.util.Scanner;

/**
 * ���󣺼���¼������,Ҫ����������λ������,����Ҫ�����ݽ��м���,���ܹ�������:
 * ÿλ���ֶ�����5,Ȼ�����10���������������,
 * �ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ����,
 * ��Ѽ��ܺ���������������̨
 * 
 * ������
 *      A:����¼��һ��4λ��
 *          ������4567
 *      B:����һ������Ϊ4������
 *          int[] arr = new int[4];
 *          arr = {4,5,6,7};
 *      C:�������е����ݽ��м��ܹ���Ĳ���
 *          ÿλ���ֶ�����5,Ȼ�����10���������������
 *              arr[x] += 5;
 *              �����arr = {9,10,11,12};
 *              arr[x] %= 10;
 *              �����arr = {9,0,1,2};
 *          �ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ����
 *              �����arr = {2,1,0,9};
 *      D:��Ѽ��ܺ���������������̨
 * @author Yao Xue
 * @date Jun 30, 2017 8:36:10 PM
 */
public class DataEncrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������Ҫ���ܵ���λ����");
        int data = sc.nextInt();
        int[] arr = new int[4];
        
        encrypt(arr,data);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    
    public static void encrypt(int[] arr, int data) {
        arr[0] = data / 10 / 10 / 10 % 10;
        arr[1] = data / 10 / 10 % 10;
        arr[2] = data / 10 % 10;
        arr[3] = data % 10;
       
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
            arr[i] %= 10;
        }
       
        for (int i = 0,j = arr.length - 1; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
