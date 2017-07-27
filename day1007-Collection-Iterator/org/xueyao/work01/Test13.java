package org.xueyao.work01;
/**
 * 1.   编写一个泛形方法，数组是任意类型,并传入2个要交换位置的索引
    2.  使用第三方变量的方式交换数组中的元素
    3.  定义一个String数组,调用swap方法,交换指定索引的元素
    4.  打印交换后的元素
    5.  定义一个Integer数组,调用swap方法,交换指定索引的元素
    6.  打印交换后的元素

 * @author Yao Xue
 * @date Jul 27, 2017 9:05:02 AM
 */
public class Test13 {
    public static void main(String[] args) {
        //String[] arr = {"abc","cde"};
        Integer[] arr = {1,2,3,4};
        swap(arr, 0, 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static <E> void swap(E[] arr, int index1, int index2) {
        E temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
