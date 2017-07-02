package org.xueyao.homework;

import java.io.File;

/**
 * @author Yao Xue
 * @date Jun 29, 2017 11:49:56 PM
 */
public class HomeWork_05 {
    public static void main(String[] args) {
        /*
         * 第五题: 分析以下需求，并用代码实现
            1.定义一个方法equals(int[] arr1,int[] arr2),功能:比较两个数组是否相等(长度和内容均相等则认为两个数组是相同的)
            2.定义一个方法fill(int[] arr,int value),功能:将数组arr中的所有元素的值改为value
            3.定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value),功能:将数组arr中的元素从索引fromIndex开始到toIndex(不包含toIndex) 
                对应的值改为value
            4.定义一个方法copyOf(int[] arr, int newLength),功能:将数组arr中的newLength个元素拷贝到新数组中,并将新数组返回,从索引为0开始
            5.定义一个方法copyOfRange(int[] arr,int from, int to),功能:将数组arr中从索引from(包含from)开始到索引to结束(不包含to)的元素复制到新数组中
                ,并将新数组返回
         */
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = arr1;
        boolean equal = equals(arr1, arr2);
        System.out.println(equal);
        int[] arr = {1,2,3,4,5,6};
        fill(arr, 7);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        System.out.println("----------");
        
        fill(arr, 1,4,10);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
        System.out.println("----------");
        
        int[] copy = copyOf(arr, 4);
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+"  ");
        }
        System.out.println();
        System.out.println("----------");
        
        int[] copyOfRange = copyOfRange(arr, 0, 3);
        for (int i = 0; i < copyOfRange.length; i++) {
            System.out.print(copyOfRange[i]+"  ");
        }
        System.out.println();
    }
    
    public static boolean equals(int[] arr1,int[] arr2) {
        boolean bool = false;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] == arr2[i]) { //TODO  此处有错误
                    bool = true;
                }else{
                    bool = false;
                }
            }
        } else {
            bool = false;
        }
        return bool;
    }
    
    public static void  fill(int[] arr,int value) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = value;
        }
    }
    
    public static int[] fill(int[] arr,int fromIndex,int toIndex,int value) {
        for (int i = fromIndex; i < toIndex; i++) {
            arr[i] = value;
        }
        return arr;
    }
    
    public static int[] copyOf(int[] arr, int newLength) {
        int[] arr2 = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
    
    public static int[] copyOfRange(int[] arr,int from, int to) {
        int[] arr2 = new int[to-from];
        for (int i = from; i < to; i++) {
            arr2[i] = arr[i];
        }
        
        return arr2;
    }
}
