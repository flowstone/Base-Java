package org.xueyao.flowcontrol;
/*
 * 1-100֮���������
 */
public class ForHundredOddSum {
    public static void main(String[] args) {
        int oddSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 !=0) {
                oddSum += i;
            }
        }
        System.out.println("1-100֮�����������"+oddSum);
    }
}
