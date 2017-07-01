package org.xueyao;
/**
 * 【程序3】
题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，
其各位数字立方和等于该数本身。

 * @author Yao Xue
 * @date Jul 1, 2017 5:04:51 PM
 */
public class Flower_03 {
    public static void main(String[] args) {
        getFlower();
    }
    
    public static void getFlower() {
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            
            if (i == (ge*ge*ge + shi*shi*shi + bai*bai*bai)) {
                System.out.println("水仙花数有"+i);
            }
        }
    }
}
