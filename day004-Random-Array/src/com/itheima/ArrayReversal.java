package com.itheima;
/**
 * ���鷴ת
 * @author Yao Xue
 * @date Jun 29, 2017 3:54:21 PM
 */
public class ArrayReversal {
    public static void main(String[] args) {
        int[] arr = {22, 33, 4, 56, 33};
        
        /*
         * 22 33 4 56 33
         * 33 56 4 33 22
         */
        //for (int i = 0,j = arr.length-1; i < arr.length; i++,j--) {  //���鷴ת���Σ����� 
        for (int i = 0,j = arr.length-1; i <=j; i++,j--) {    //���鷴תһ��
            int temp = arr[i];
            arr[i]  = arr[j];
            arr[j] = temp;
            System.out.println(i+"---"+j);
        }
        System.out.println("--------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
