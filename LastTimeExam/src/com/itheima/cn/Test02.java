package com.itheima.cn;


/**
 * 2.定义一个int型的数组，包含10个元素，分别赋值为0~9,然后将数组中的元素都往前移一个位置，
        即：a[0]=a[1],a[1]=a[2],...最后一个元素的值是原来第一个元素的值，然后输出这个数组
        演示格式如下：
        转换后的元素顺序如下：
        1 2 3 4 5 6 7 8 9 0 
 * @author Yao Xue
 * @date Jul 8, 2017 7:42:32 PM
 */
public class Test02 {
    public static void main(String[] args) {
        int[] a = {0,1,2,3,4,5,6,7,8,9};
        int temp = a[0];
        for (int i = 0,j=1; i < a.length; i++) {
                if (j <= a.length-1) {
                    a[i] = a[j++];
                }
        }
        a[a.length-1] = temp;
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
