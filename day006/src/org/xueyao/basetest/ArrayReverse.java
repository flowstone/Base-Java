package org.xueyao.basetest;

import java.util.Scanner;

/**
 * ����
 * (1)����¼��5��int���͵����ݴ洢����arr��
 * (2)���巽����arr�����е����ݷ�ת
 * (3)���巽���Է�ת���������б���
 * 
 * ������
 *      A:����һ������Ϊ5������
 *      B:ͨ������¼�����ݸ������е�Ԫ�ظ�ֵ
 *      C:���巽����arr�����е����ݷ�ת
 *          ʲô�Ƿ�ת?���ʵ�ַ�ת
 *      D:���巽���Է�ת���������б���
 * @author Yao Xue
 * @date Jun 30, 2017 7:39:27 PM
 */
public class ArrayReverse {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("�������"+(i+1)+"�����֣�");
            arr[i] = sc.nextInt();
        }
        
        System.out.println("��ת֮ǰ������Ϊ");
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.println(arr[i]+"]");
            } else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.println();

        
        reverse(arr);
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.println(arr[i]+"]");
            } else {
                System.out.print(arr[i]+",");
            }
        }
        System.out.println();

    }
    
    public static void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
