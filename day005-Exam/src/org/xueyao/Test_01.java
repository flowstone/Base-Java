package org.xueyao;

import java.util.Random;

/**
 * ��ȡ10����������ۼӺͣ�����Ҫ�����£�
        ���� int[] getArr(int n)��̬��������������ɣ��������n��100~999������100��999��֮����������������������arr�в�����
        ����main��������main��������ɣ�
        1������10��Ϊ��������getArr��������ȡ����ֵarr��
        2������arr������Ԫ�ص��ܺͣ�
        3���ڿ���̨�д�ӡ�ܺ�

 * @author Yao Xue
 * @date Jul 1, 2017 6:58:33 PM
 */
public class Test_01 {
    public static void main(String[] args) {
       int n = 10;
       int[] arr = getArr(n);
       /* ������
       System.out.print("[");
       for (int i = 0; i < arr.length; i++) {
           if (i == arr.length-1) {
               System.out.print(arr[i]+"]");
           } else {
               System.out.print(arr[i]+", ");
           }
           
       }
       System.out.println();
       */
       int sum = 0;
       for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
       }
       
       System.out.println("�����ܺ�Ϊ"+sum);
    }
    /**
     * @Description: TODO ��ʼ������
     * @return: int[]
     */
    public static int[] getArr(int n) {
        Random r = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length;) {
            int temp = r.nextInt(900)+100;
            if (temp % 2 != 0) {
                arr[i] = temp;
                i++;
            }
        }
        return arr;
    }
}
