package org.xueyao.array;
/*
 * ��������С���⣺
 *      ArrayIndexOutOfBoundsException:��������Խ���쳣
 *          ������ԭ��:���Ƿ����˲����ڵ�����
 *      NullPointerException:��ָ���쳣
 *          ������ԭ�������Ѿ�����ָ�����ڴ�������ˣ��㻹ʹ��������ȥ����Ԫ��    
 */
public class ArrayIssue {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3};
        
        //System.out.println(arr[3]);
        
        //���� ���ͣ��࣬�ӿڣ����� 
        //�������ճ�����null���ǿ��Ը�ֵ����������
        
        arr = null;
        System.out.println(arr[1]);
    }
}
