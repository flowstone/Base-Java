package org.xueyao.array;
/*
 * �������������飬�ȶ���һ�����飬��ֵ�������Ȼ����ڶ��������ʱ��ѵ�һ������ĵ�ַ��ֵ���ڶ�
 * �����顣Ȼ����ڶ������鸳ֵ���ٴ�����������������Ԫ��
 */
public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("------------");
        
        //����ڶ��������ʱ��ѵ�һ������ĵ�ַ��ֵ���ڶ������顣
        int[] arr2 = arr;
        arr2[0] = 400;
        arr2[1] = 500;
        arr2[2] = 600;
        
        //������������������Ԫ��
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("-------------");
        
        System.out.println(arr2);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println("-------------");
    }
}
