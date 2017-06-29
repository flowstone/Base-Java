package org.xueyao.method;
/**
 * 把遍历数组改进为方法实现，并调用方法
 * @author Yao Xue
 * @date Jun 29, 2017 8:47:48 PM
 */
public class MethodArray {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        printArray(arr);
    }
    
    /**
     * 
     * @Title: printArray
     * @Description: TODO 遍历数组
     * @param 
     * @return void
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.println(arr[i]+"]");
            } else {
                System.out.print(arr[i]+", ");
            }
        }
    }
}
