package org.xueyao.array;
/*
 * 数组遍历(依次输出数组中的每一个元素)
 */
public class ArrayErgodic {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        
        System.out.println("-----------");
        
        //for循环遍历
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("------------");
        
        //为了解决我们去数组中数元素的个数，数组就提供了一个属性：length
        //用于获取数组元素个数
        //格式：数组名.length
        System.out.println("数组共有"+arr.length+"个");
        System.out.println("---------------");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
