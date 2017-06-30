package org.xueyao.debug;
/**
 * 参数是引用数据类型：
 *      形式参数的改变直接影响实际参数
 * @author Yao Xue
 * @date Jun 30, 2017 5:36:01 PM
 */
public class DebugTest3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        change(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static void change(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] *= 2;
            }
        }
    }
}
