package org.xueyao.newhomework;
/**
 * 第五题: 分析以下需求，并用代码实现
    有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13... 定义一个方法求出这个数列的前20 项之和。
 * @author Yao Xue
 * @date Jul 2, 2017 9:10:06 PM
 */
public class HomeWork_05 {
    public static void main(String[] args) {
        int m = 1;
        int n = 1;
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += (m + n) / n;
            System.out.println(m+"+"+n+"/"+n);
            int temp = n;
            n = m + n;
            m = temp;
        }
        System.out.println("前20项之和"+sum);
    }
}
