package org.xueyao.method;
/**
 * �ѱ�������Ľ�Ϊ����ʵ�֣������÷���
 * @author Yao Xue
 * @date Jun 29, 2017 8:47:48 PM
 */
public class MethodArray {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55};
        printArray(arr);
    }
    
    /**
     * 
     * @Title: printArray
     * @Description: TODO ��������
     * @param 
     * @return void
     */
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1) {
                System.out.println(arr[i]+"]");
            } else {
                System.out.print(arr[i]+", ");
            }
        }
    }
}
