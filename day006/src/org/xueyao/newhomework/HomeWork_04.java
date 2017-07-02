package org.xueyao.newhomework;

import java.util.Scanner;

/**
 * ������: �����������󣬲��ô���ʵ��
    1.����¼��10����������������
    2.����һ������������������������,ż������������Ҳ�
    3.����һ��������ӡԭ����ʹ���������
 * @author Yao Xue
 * @date Jul 2, 2017 9:09:34 PM
 */
public class HomeWork_04 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("�������"+(i+1)+"������");
            arr[i] = sc.nextInt();
        }
        
        int[] arr1 = arraySwap(arr);
        printArray(arr);
        System.out.println();
        printArray(arr1);
    }
    /**
     * @Description: TODO ����һ��������ӡԭ����ʹ���������
     * @return: void
     */
    public static void printArray(int[] arr1) {
        System.out.print("[");
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                System.out.print(arr1[i]+"]");
            } else {
                System.out.print(arr1[i]+", ");
            }
        }
    }
    /**
     * @Description: TODO ����һ������������������������,ż������������Ҳ�
     * @return: int[]
     */
    public static int[] arraySwap(int[] arr) {
        int[] arr1 = new int[arr.length];
        int start = 0;
        int end = arr1.length-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 !=0) {
                arr1[start] = arr[i];
                start++;
            } else {
                arr1[end] = arr[i];
                end--;
            }
        }
        return arr1;
    }
}
