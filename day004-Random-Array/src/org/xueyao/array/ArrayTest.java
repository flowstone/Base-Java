package org.xueyao.array;
/*
 * ����һ�����飬�����������Ԫ�ء�Ȼ��������е�Ԫ�ظ�ֵ���ٴ������������Ԫ��
 */
public class ArrayTest {
    public static void main(String[] args) {
        //��������
        int[] arr = new int[3];
        
        //�����������Ԫ��
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        
        System.out.println("------------");
        //�������е�Ԫ�ظ�ֵ
        arr[0] = 100;
        arr[2] = 200;
        //�����������Ԫ��
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("------------");
        
    }
}
