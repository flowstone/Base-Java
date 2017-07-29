package org.xueyao.parm;
/**
 * @author Yao Xue
 * @date Jul 29, 2017 10:42:13 AM
 */
public class ParmDemo {
    public static void main(String[] args) {
        int[] arr = {21,89,32};
        int sum = add(arr);
        
        System.out.println(sum);
        sum = add(21,89,32); //可变参数调用形式
        
        System.out.println(sum);
       
    }
    private static int add(int ... arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    
        
}
