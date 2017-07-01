package com.itheima;
/**
 * 打印水仙花数
 * @author Yao Xue
 * @date Jul 1, 2017 2:48:37 PM
 */
public class PrintFlower {
    public static void main(String[] args) {
        flower();
    }
    
    public static void flower() {
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            if (i == (ge*ge*ge + shi*shi*shi + bai*bai*bai)) {
                System.out.println(i+"是水仙花数");
            }
        }
    }
}
