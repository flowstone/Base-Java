package org.xueyao.newhomework;
/**
 * ��һ�⣺
    ����һ�����������ڷ���int�����ƽ��ֵ
 * @author Yao Xue
 * @date Jul 2, 2017 9:08:01 PM
 */
public class HomeWork_01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int avg = getAvg(arr);
        System.out.println("�����ƽ���֣�"+avg);
    }
    /**
     * @Description: TODO ���ڷ���int�����ƽ��ֵ
     * @return: int
     */
    public static int getAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
