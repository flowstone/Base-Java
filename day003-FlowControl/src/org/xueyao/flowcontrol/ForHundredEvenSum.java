package org.xueyao.flowcontrol;
/*
 * 1-100之间的偶数和
 */
public class ForHundredEvenSum {
    public static void main(String[] args) {
        
        int evenSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        
        System.out.println("1-100之间的偶数和为"+evenSum);
    }
}
