package org.xueyao.array;
/*
 * ����������ֵ
 */
public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15, 16};
        
        //Ĭ�������һ��ֵ������
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            
        }
        System.out.println("������������Ϊ"+max);
    }
}
