package org.xueyao.array;
/*
 * 数组中最大的值
 */
public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15, 16};
        
        //默认数组第一个值是最大的
        int max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            
        }
        System.out.println("数组中最大的数为"+max);
    }
}
