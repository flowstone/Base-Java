package org.xueyao.flowcontrol;
/*
 * for循环实现1-5之间数据求和
 */
public class ForOneToFiveSum {
    public static void main(String[] args) {
        
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }
        
        System.out.println("1+2+3+4+5="+sum);
    }
}
