package org.xueyao.array;
/*
 * 两个常见小问题：
 *      ArrayIndexOutOfBoundsException:数组索引越界异常
 *          产生的原因:我们访问了不存在的索引
 *      NullPointerException:空指针异常
 *          产生的原因：数组已经不在指定堆内存的数据了，你还使用数组名去访问元素    
 */
public class ArrayIssue {
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3};
        
        //System.out.println(arr[3]);
        
        //引用 类型：类，接口，数组 
        //常量：空常量，null，是可以赋值给引用类型
        
        arr = null;
        System.out.println(arr[1]);
    }
}
