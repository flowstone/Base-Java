package org.xueyao.work01;


/**1.   编写一个泛形方法reverse，接收一个任意数组
    2.  在reverse方法中将数组传入的元素反转
    3.  定义一个String数组,调用reverse方法,反转数组中的元素
    4.  打印反转后的元素
    5.  定义一个Integer数组,调用reverse方法,反转数组中的元素
    6.  打印反转后的元素

 * @author Yao Xue
 * @date Jul 27, 2017 9:24:02 AM
 */
public class Test14 {
    public static void main(String[] args) {
        String[] arr = {"abc","efg", "hala"};
        reverse(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    /**
     * @description 反转任意类型数组
     * @param arr  任意类型的数组
     */
    public static <E> void reverse(E[] arr) {
        for (int start  = 0, end = arr.length-1; start < end; start++, end--) {
            E temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}
