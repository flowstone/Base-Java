package com.itheima;
/**
 * 方法的练习之数组获取最值
 * @author Yao Xue
 * @date Jul 1, 2017 5:06:56 PM
 */
public class MethodMaxOrMin {
    public static void main(String[] args) {
        int[] arr = {13,42,35,74,80,90};
        int max = getMax(arr);
        int min = getMin(arr);
        
        System.out.println("max:"+max);
        System.out.println("min:"+min);
    }
    /**
     * @Description: TODO  获取数组中最大值
     * @return: int
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    /**
     * @Description: TODO  获取数组中最小值
     * @return: int
     */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
}
