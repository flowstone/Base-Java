package org.xueyao.array;
/*
 * ��������С��ֵ
 */
public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = {25,16,54,89,2};
        
        //Ĭ�������һ����Ϊ��Сֵ
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println("��������С����Ϊ"+min);
    }
}
