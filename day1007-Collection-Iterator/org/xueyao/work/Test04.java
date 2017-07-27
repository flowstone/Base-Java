package org.xueyao.work;
/**
 * 往int[]添加以下元素{11, 22, 33}使用增强for遍历数组中的元素
 * 1.   创建数组
    2.  使用增强for循环获取数组中的元素

 * @author Yao Xue
 * @date Jul 26, 2017 7:54:47 PM
 */
public class Test04 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
