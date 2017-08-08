package org.xueyao.junit.task01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
一、   请定义类ArrayTools，并定义以下方法：
1.  方法printArray，此方法可以接收一个int[]数组，并打印这个数组中的所有元素（多个元素之间用逗号隔开）。
2.  方法：check，在方法内打印：”之前执行......”
3.  方法：log，在方法内打印：”之后执行......”
4.  方法test()，并使用JUnit测试printArray方法。要求在执行前先执行check()方法，在执行后执行log()方法。

 * @author Yao Xue
 * @date Aug 7, 2017 4:10:29 PM
 */
public class ArrayTools {
    @Test
    public void test() {
        int[] arr = {1,2,3,4,12,32,43,52,35};
        printArray(arr);
    }
    
    
    public void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i : arr) {
            sb.append(i+",");
        }
        String substring = sb.substring(0, sb.length()-1);
        System.out.println(substring);
    }
    @Before
    public void check() {
        System.out.println("之前执行......");
    }
    
    @After
    public void log() {
        System.out.println("之后执行");
    }
    
    
}
