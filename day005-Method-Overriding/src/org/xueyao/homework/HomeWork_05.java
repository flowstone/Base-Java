package org.xueyao.homework;

import java.io.File;

/**
 * @author Yao Xue
 * @date Jun 29, 2017 11:49:56 PM
 */
public class HomeWork_05 {
    public static void main(String[] args) {
        /*
         * ������: �����������󣬲��ô���ʵ��
            1.����һ������equals(int[] arr1,int[] arr2),����:�Ƚ����������Ƿ����(���Ⱥ����ݾ��������Ϊ������������ͬ��)
            2.����һ������fill(int[] arr,int value),����:������arr�е�����Ԫ�ص�ֵ��Ϊvalue
            3.����һ������fill(int[] arr,int fromIndex,int toIndex,int value),����:������arr�е�Ԫ�ش�����fromIndex��ʼ��toIndex(������toIndex) 
                ��Ӧ��ֵ��Ϊvalue
            4.����һ������copyOf(int[] arr, int newLength),����:������arr�е�newLength��Ԫ�ؿ�������������,���������鷵��,������Ϊ0��ʼ
            5.����һ������copyOfRange(int[] arr,int from, int to),����:������arr�д�����from(����from)��ʼ������to����(������to)��Ԫ�ظ��Ƶ���������
                ,���������鷵��
         */
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = arr1;
        boolean equal = equals(arr1, arr2);
        System.out.println(equal);
        int[] arr = {1,2,3,4,5,6};
        fill(arr, 7);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        System.out.println("----------");
        
        fill(arr, 1,4,10);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        System.out.println("----------");
        
        int[] copy = copyOf(arr, 4);
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+"  ");
        }
        System.out.println();
        System.out.println("----------");
        
        int[] copyOfRange = copyOfRange(arr, 0, 3);
        for (int i = 0; i < copyOfRange.length; i++) {
            System.out.print(copyOfRange[i]+"  ");
        }
        System.out.println();
    }
    
    public static boolean equals(int[] arr1,int[] arr2) {
        boolean bool = false;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) { //TODO  �˴��д���
                    bool = true;
                }else{
                    bool = false;
                }
            }
        } else {
            bool = false;
        }
        return bool;
    }
    
    public static void  fill(int[] arr,int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
    }
    
    public static int[] fill(int[] arr,int fromIndex,int toIndex,int value) {
        for (int i = fromIndex; i < toIndex; i++) {
            arr[i] = value;
        }
        return arr;
    }
    
    public static int[] copyOf(int[] arr, int newLength) {
        int[] arr2 = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
    
    public static int[] copyOfRange(int[] arr,int from, int to) {
        int[] arr2 = new int[to-from];
        for (int i = from; i < to; i++) {
            arr2[i] = arr[i];
        }
        
        return arr2;
    }
}
