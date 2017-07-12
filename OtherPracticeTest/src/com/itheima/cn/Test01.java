package com.itheima.cn;

import java.util.Random;

/**
 * 获取一个1-500之间(包含1和500)的随机数n，求0-n之间(包含0和n)的偶数和，并打印到控制台上;
 * @author Yao Xue
 * @date Jul 8, 2017 7:42:22 PM
 */
public class Test01 {
    public static void main(String[] args) {
        Random rd = new Random();
        int n = rd.nextInt(500)+1;
        
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("sum:"+sum);
    }
}
