package com.itheima;

import java.util.Scanner;

/**
 *  * ���󣺼���¼������,Ҫ����������λ������,����Ҫ�����ݽ��м���,���ܹ�������:
 * ÿλ���ֶ�����5,Ȼ�����10���������������,
 * �ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ����,
 * ��Ѽ��ܺ���������������̨
 * 
 * ������
 *      A:����¼��һ����λ��
 *      B:�����ݽ��м���
 *          ������
 *              4567
 *              �������λ���ֳɸ���ʮ���٣�ǧ�洢��������
 *              int[] arr = {4,5,6,7};
 *              ÿλ���ֶ�����5��
 *                  arr[x] += 5;    {9,10,11,12}
 *              Ȼ�����10��������������֣�
 *                  arr[x] %= 10;   {9,0,1,2}
 *               �ٽ���һλ�͵���λ����,�ڶ�λ�͵���λ������
 *                  {9,0,1,2}       {2,1,0,9}
 *      C:������ܺ������
 * @author Yao Xue
 * @date Jul 2, 2017 1:26:59 PM
 */
public class SimpleDataEncrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("��������λ����");
        int number = sc.nextInt();
        int[] arr = new int[4];
        createArray(arr,number);
        //�жϼ��������Ƿ�����λ��
        if (number >9999 || number < 1000) {
            System.out.println("�����������λ������ȷ������������");
        } else {
            arithmeticEncrypt(arr);
            
            swapEncrypt(arr);
            printData(arr);
        }
    }
    /**
     * @Description: TODO  ���ɼ��ܺ�����
     * @return: void
     */
    public static void printData(int[] arr) {
       
        for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i]);
        }
    }
    /**
     * @Description: TODO ��������
     * @return: void
     */
    public static void swapEncrypt(int[] arr) {
        for (int i = 0,j = arr.length-1; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    
    /**
     * @Description: TODO ��������
     * @return: void
     */
    public static void arithmeticEncrypt(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] += 5;
            arr[i] %= 10;
        }
    }
    /**
     * @Description: TODO ������ת�������鷽�����
     * @return: void
     */
    public static void  createArray(int[] arr,int number) {
        
        arr[3] = number % 10;
        arr[2] = number / 10 % 10;
        arr[1] = number / 10 / 10 % 10;
        arr[0] = number / 10 / 10 / 10 % 10;
    }
}
