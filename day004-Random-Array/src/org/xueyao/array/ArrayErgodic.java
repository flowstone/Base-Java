package org.xueyao.array;
/*
 * �������(������������е�ÿһ��Ԫ��)
 */
public class ArrayErgodic {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        
        System.out.println("-----------");
        
        //forѭ������
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("------------");
        
        //Ϊ�˽������ȥ��������Ԫ�صĸ�����������ṩ��һ�����ԣ�length
        //���ڻ�ȡ����Ԫ�ظ���
        //��ʽ��������.length
        System.out.println("���鹲��"+arr.length+"��");
        System.out.println("---------------");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
