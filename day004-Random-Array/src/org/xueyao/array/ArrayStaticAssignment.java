package org.xueyao.array;
/*
 * 数组静态赋值
 * 
 * 静态初始化的格式：
 *      数据类型[] 数组名 = new 数据类型[]{元素1，元素2，....};
 *      
 *      举例：
 *          int[] arr = new int[]{1,2,3,.....};
 *          
 *      简化格式：
 *          数据类型[] 数组名 = {元素1，元素2，元素3，....};
 *          int[] arr = {1,2,3};
 */
public class ArrayStaticAssignment {
    public static void main(String[] args) {
        int[] arr = {100, 200, 300};
        
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}
