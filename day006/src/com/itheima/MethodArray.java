package com.itheima;
/**
 *  * ����
 * (1)����һ��int���͵�һά���飬����Ϊ{171,72,19,16,118,51,210,7,18}
 * (2)���������������Ҫ���Ԫ�غ͡�
 *      Ҫ����͵�Ԫ�صĸ�λ��ʮλ���ܰ���7,����ֻ��Ϊż����
 * 
 * ������
 *      A:����һ��int���͵�һά����
 *      B:����һ����ͱ���
 *      C:�������飬��ȡ�������е�ÿһ��Ԫ��
 *      D:�жϸ�Ԫ���Ƿ���������Ҫ������Ǿ��ۼӣ����򣬲�������
 *          x%2==0
 *          x%10 != 7
 *          x/10%10 !=7
 *      E:������
 * @author Yao Xue
 * @date Jul 2, 2017 12:42:21 PM
 */
public class MethodArray {
    public static void main(String[] args) {
        int[] arr = {171,72,19,16,118,51,210,7,18};
        printSum(arr);
    }
    //��͵�Ԫ�صĸ�λ��ʮλ���ܰ���7,����ֻ��Ϊż��
    public static void printSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] % 10 != 7) && (arr[i] / 10 % 10 != 7) && (arr[i] % 2 == 0)) {
                sum += arr[i];
                System.out.println(arr[i]);
            }
        }
        System.out.println(sum);
    }
}
