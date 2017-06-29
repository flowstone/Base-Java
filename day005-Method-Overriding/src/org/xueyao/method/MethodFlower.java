package org.xueyao.method;
/**
 * 打印所有的水仙花数
 * @author Yao Xue
 * @date Jun 29, 2017 8:04:43 PM
 */
public class MethodFlower {
    public static void main(String[] args) {
        printFlower();
    }
    
    public static void printFlower() {
        for (int i = 100; i <=999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i /10 /10 % 10;
            
            if (i == (ge*ge*ge + shi*shi*shi + bai*bai*bai)) {
                System.out.println(i);
            }
        }
    }
}
