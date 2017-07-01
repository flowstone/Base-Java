package com.itheima;
/**
 * @author Yao Xue
 * @date Jul 1, 2017 10:37:57 AM
 */
public class ArraySum {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int sum = getSum(arr1, arr2);
        System.out.println("sum:"+sum);
    }
    
    /**
     * @Description: TODO  两个数组的和
     * @return: int
     */
    public static int getSum(int[] arr1, int[] arr2) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            sum += arr2[i];
        }
        
        return sum;
    }
}
