package com.itheima;
/**
 *  * 需求：
 * (1)定义一个int类型的一维数组，内容为{171,72,19,16,118,51,210,7,18}
 * (2)求出该数组中满足要求的元素和。
 *      要求：求和的元素的个位和十位不能包含7,并且只能为偶数。
 * 
 * 分析：
 *      A:定义一个int类型的一维数组
 *      B:定义一个求和变量
 *      C:遍历数组，获取到数组中的每一个元素
 *      D:判断该元素是否满足如下要求，如果是就累加，否则，不搭理它
 *          x%2==0
 *          x%10 != 7
 *          x/10%10 !=7
 *      E:输出结果
 * @author Yao Xue
 * @date Jul 2, 2017 12:42:21 PM
 */
public class MethodArray {
    public static void main(String[] args) {
        int[] arr = {171,72,19,16,118,51,210,7,18};
        printSum(arr);
    }
    //求和的元素的个位和十位不能包含7,并且只能为偶数
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
