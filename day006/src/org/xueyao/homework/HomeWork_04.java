package org.xueyao.homework;

import java.util.Scanner;

/**
 * ������: �����������󣬲��ô���ʵ��
    1.����¼��10����������������
    2.����һ������������������������,ż������������Ҳ�
    3.����һ��������ӡԭ����ʹ���������
    4.����һ����������һ��int�������飬������������ֻ����һ�ε����ּ�����
    2 2 3 4 4 6 7 8  10
        3     6 7 8 10
 * @author Yao Xue
 * @date Jul 1, 2017 9:34:00 PM
 */
public class HomeWork_04 {
    public static void main(String[] args) {
        //initArray(10);
        int[] arr = {2,2,3,4,4,6,7,8,9,10};
        //int[] arr1 = swapArray(arr);
        //printArray(arr, arr1);
        //System.out.println();
        printNumberCount(arr);
    }
    //    4.����һ����������һ��int�������飬������������ֻ����һ�ε����ּ�����

    public static void printNumberCount(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = 0; j < arr.length; j++) {
                if (temp == arr[j] && j!=i) {
                   break;
                } else if (j == arr.length-1) {
                    System.out.println(temp);
                    count++;
                }
            }
        }
        System.out.println("ֻ����һ�ε����ֵĸ���"+count);
    }

    public static void printArray(int[] arr, int[] arr1) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]+"]");
            } else {
                System.out.print(arr[i]+", ");
            }
        }
        System.out.println();
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i]+"]");
            } else {
                System.out.print(arr1[i]+", ");
            }
        }
    }
    
    public static int[]  initArray(int num) {
        int[] arr = new int[num];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("�������"+(i+1)+"������");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    //����һ������������������������,ż������������Ҳ�
    public static int[] swapArray(int[] arr) {
        int[] arr1 = new int[arr.length];
        int start = 0;
        int end = arr1.length-1;
        for (int i = 0; i < arr.length; i++) {
           if (arr[i] % 2 != 0) {
               arr1[start] = arr[i];
               start++;
           } 
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr1[end] = arr[i];
                end--;
            } 
        }
        return arr1;
    }
    
    

}
