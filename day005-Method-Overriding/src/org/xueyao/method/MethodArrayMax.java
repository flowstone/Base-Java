package org.xueyao.method;
/**
 * @author Yao Xue
 * @date Jun 29, 2017 8:56:20 PM
 */
public class MethodArrayMax {
    public static void main(String[] args) {
        int[] arr = {11, 33, 25, 54, 21};
        int max = getArrayMax(arr);
        System.out.println("��������"+max);
    }
    
    /**
     * 
     * @Title: getMax
     * @Description: TODO  ��������ֵ
     * @param 
     * @return int
     */
    public static int getArrayMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
