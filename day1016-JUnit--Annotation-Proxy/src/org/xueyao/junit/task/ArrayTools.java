package org.xueyao.junit.task;

import org.junit.Test;

/**
一、   请定义类ArrayTools，包含一个方法getMax，此方法可以接收一个int[]数组，
        并返回这个数组中的最大值。
二、  在ArrayTools中定义方法test()，并使用JUnit测试getMax方法；

 * @author Yao Xue
 * @date Aug 7, 2017 4:01:05 PM
 */
public class ArrayTools {
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i: arr) {
            if (max < i) {
                max = i;
            }
        }
        return max;
    }
    
    @Test
    public void test() {
        int[] arr = {1,2,4,6,199,32,52,32,12,35};
        System.out.println("最大值:"+getMax(arr));
    }
}


