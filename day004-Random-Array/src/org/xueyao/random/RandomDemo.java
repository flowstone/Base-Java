package org.xueyao.random;

import java.util.Random;
import java.util.Scanner;

/*
 * Random:用于产生随机数
 * 
 * 使用步骤
 *  A：导包
 *      import java.util.Random
 *  B:创建对象
 *      Random r = new Random();
 *  C:获得随机数
 *      int number = r.nextInt(10);
 *      获取数据的范围：[0,10)包括0，不包括10
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        
        int number = r.nextInt(10);
        System.out.println("获得的随机数为"+number);
        
        //for循环
        for (int i = 1; i <= 10; i++) {
            int number1 = r.nextInt(10);
            System.out.println("Random:"+number1);
        }
        System.out.println("-----------");
        
        //如获获取1-100之间的随机数
        int i = r.nextInt(100)+1;
        System.out.println("i:"+i);
        
    }
}
