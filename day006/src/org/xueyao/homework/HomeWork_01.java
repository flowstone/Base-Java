package org.xueyao.homework;

import java.util.Scanner;

/**
 * �ڶ���: �����������󣬲��ô���ʵ��
    1.����¼��6��int���͵����ݴ�������arr��
    2.��arr�����е����ݷ�ת
    3.����ת�������Ǳ�Ϊ�����Ļ��ཻ�� 1��3��, 3��5��,�Դ�����
    4.����������һ���Ǳ�Ϊ������Ԫ�� �������е�һ���Ǳ�Ϊ������Ԫ�ؽ���
    5.��ӡ���յ�����(ʵ����1-4��֮�������)
    6.�磺�û������6��int����Ϊ[1,2,3,4,5,6],�������Ľ��Ϊ[6, 5, 4, 1, 2, 3]
 * @author Yao Xue
 * @date Jul 1, 2017 8:56:21 PM
 */
public class HomeWork_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("�������"+(i+1)+"������");
            arr[i] = sc.nextInt();
        }
        reverseArray(arr);
        
        printArray(arr);
        //����ת�������Ǳ�Ϊ�����Ļ��ཻ�� 1��3��, 3��5��,�Դ�����
        for (int i = 1, j = 3; j <= arr.length; i=i+2, j=j+2) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        printArray(arr);
        //����������һ���Ǳ�Ϊ������Ԫ�� �������е�һ���Ǳ�Ϊ������Ԫ�ؽ���
        for (int i = 1, j = arr.length-1; i <= j; j--) {
            if (j % 2 != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                break;
            }
            
        }
        
        printArray(arr);
        
    }
    /**
     * @Description: TODO ��������
     * @return: void
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.print(arr[i]+"]");
            } else {
                System.out.print(arr[i]+", ");
            }
            
        }
        System.out.println();
    }
    /**
     * @Description: TODO ���鷴ת
     * @return: void
     */
    public static void reverseArray(int[] arr) {
        //��arr�����е����ݷ�ת
        for (int i = 0, j = arr.length-1; i <= j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
