package org.xueyao.homework;
/**
 * @author Yao Xue
 * @date Jun 28, 2017 10:36:04 PM
 */
public class Test {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5};
        int[] temp1 = arr1;
        int[] temp2 = arr1;
        System.out.println("ͨ��temp1ȡ������ֵ: ");
        for(int i = 0;i<temp1.length;i++) {
            System.out.print(temp1[i]+" ");
        }
        System.out.println();
        System.out.println("ͨ��temp2ȡ������ֵ: ");
        for(int i = 0;i<temp2.length;i++) {
            System.out.print(temp2[i]+" ");
        }
        System.out.println();
        temp1[2] = 9;
        
        System.out.println("ͨ��temp1ȡ������ֵ: ");
        for(int i = 0;i<temp1.length;i++) {
            System.out.print(temp1[i]+" ");
        }
        System.out.println();
        System.out.println("ͨ��temp2ȡ������ֵ: ");
        for(int i = 0;i<temp2.length;i++) {
            System.out.print(temp2[i]+" ");
        }
        System.out.println();
    }
}
