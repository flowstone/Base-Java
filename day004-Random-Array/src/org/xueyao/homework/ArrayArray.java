package org.xueyao.homework;
/**
 * @author Yao Xue
 * @date Jun 29, 2017 5:44:03 PM
 */
public class ArrayArray {
    public static void main(String[] args) {
        /*
         * 定义一个包含两个一维数组的二维数组
                                第一个一维数组元素为:11,22,34
                                第二个一维数组元素为:33,17
                                遍历该一维数组并且打印所有的元素
         */
        int[][] arr = {{11, 22, 34}, {33, 17}};
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
