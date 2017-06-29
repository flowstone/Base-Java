package org.xueyao.method;
/**
 * @author Yao Xue
 * @date Jun 29, 2017 9:02:59 PM
 */
public class MethodArrayMin {
    public static void main(String[] args) {
        int[] arr = {11, 23, 45, 21, 89};
        int min = getArrayMin(arr);
        System.out.println("数组中最小的数"+min);
    }
    
    /**
     * 
     * @Title: getArrayMin
     * @Description: TODO   数组中最小的数
     * @param 
     * @return int
     */
    public static int getArrayMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        
        return min;
    }
}
