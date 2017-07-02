package org.xueyao.newhomework;
/**
 * 第一题：
    定义一个方法，用于返回int数组的平均值
 * @author Yao Xue
 * @date Jul 2, 2017 9:08:01 PM
 */
public class HomeWork_01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int avg = getAvg(arr);
        System.out.println("数组的平均分："+avg);
    }
    /**
     * @Description: TODO 用于返回int数组的平均值
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
