package com.itheima.cn;

import java.util.Random;

/**
 * ��ȡһ��1-500֮��(����1��500)�������n����0-n֮��(����0��n)��ż���ͣ�����ӡ������̨��;
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