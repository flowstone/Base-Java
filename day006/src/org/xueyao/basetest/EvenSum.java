package org.xueyao.basetest;
/**
 * ����
 * (1)����һ��int���͵�һά���飬����Ϊ{171,72,19,16,118,51,210,7,18}
 * (2)���������������Ҫ���Ԫ�غ͡�
 *      Ҫ����͵�Ԫ�صĸ�λ��ʮλ���ܰ���7,����ֻ��Ϊż����
 * @author Yao Xue
 * @date Jun 30, 2017 6:37:49 PM
 */
public class EvenSum {
    public static void main(String[] args) {
        int[] arr = {171,72,19,16,118,51,210,7,18};
        even(arr);
    }
    
    public static void even(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int ge = arr[i] % 10;
            int shi = arr[i] / 10 % 10;
            if ((ge != 7) && (shi != 7) && (arr[i] %2 ==0)) {
                sum += arr[i];
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("������������Ҫ���Ԫ�غ�"+sum);
    }
}
