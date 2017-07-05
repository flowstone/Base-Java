package com.itheima.string_01;
/**
 * @author Yao Xue
 * @date Jul 5, 2017 4:54:55 PM
 */
public class StringDemo3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4};
        
       String str =  stringToString(arr);
       System.out.println(str);
        
    }
    
    public static String stringToString(int[] arr) {
        // TODO Auto-generated method stub
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                str += arr[i];
            } else {
                str += arr[i] + ", ";
            }
        }
        str += "]";
        return str;
    }
}
