package org.xueyao.homework;
/**
 * @author Yao Xue
 * @date Jun 29, 2017 5:44:03 PM
 */
public class ArrayArray {
    public static void main(String[] args) {
        /*
         * ����һ����������һά����Ķ�ά����
                                ��һ��һά����Ԫ��Ϊ:11,22,34
                                �ڶ���һά����Ԫ��Ϊ:33,17
                                ������һά���鲢�Ҵ�ӡ���е�Ԫ��
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
