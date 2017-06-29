package org.xueyao.method;
/**
 * @author Yao Xue
 * @date Jun 29, 2017 9:09:09 PM
 */
public class MethodArraySum {
    public static void main(String[] args) {
        int[] arr = {11, 32, 52, 78};
        int sum = getArraySum(arr);
        System.out.println("sum:"+sum);
    }
    
    /**
     * 
     * @Title: getArraySum
     * @Description: TODO  数组中数据的和
     * @param 
     * @return int
     */
    public static int getArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
}
