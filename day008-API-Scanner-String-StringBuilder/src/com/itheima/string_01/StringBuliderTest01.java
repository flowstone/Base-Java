package com.itheima.string_01;
/**
 * @author Yao Xue
 * @date Jul 5, 2017 7:16:57 PM
 */
public class StringBuliderTest01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        String str = arrayToString(arr);
        System.out.println(str);
    }

    private static String arrayToString(int[] arr) {
        // TODO Auto-generated method stub
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i==arr.length-1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.append("]").toString();
    }
}
