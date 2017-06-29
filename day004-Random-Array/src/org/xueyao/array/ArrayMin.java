package org.xueyao.array;
/*
 * 数组中最小的值
 */
public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = {25,16,54,89,2};
        
        //默认数组第一个数为最小值
        int min = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println("数组中最小的数为"+min);
    }
}
