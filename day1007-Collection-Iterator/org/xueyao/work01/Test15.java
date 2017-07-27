package org.xueyao.work01;
/**
 * 编写一个泛形方法，接收一个任意类型数组，并将数组中的元素按照一定的格式打印.” [3, 6, 7, 1, 2] ”
 * @author Yao Xue
 * @date Jul 27, 2017 10:29:08 AM
 */
public class Test15 {
    public static void main(String[] args) {
        Integer[] arr = {3,6,7,1,2};
        printArray(arr);
    }
    /**
     * @description 输出友好的数组
     * @param arr  任意类型数组
     */
    private static <E> void printArray(E[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]+"]");
            } else {
                System.out.print(arr[i]+", ");
            }
        }
    }
}
