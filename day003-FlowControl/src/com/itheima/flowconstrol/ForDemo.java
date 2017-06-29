package com.itheima.flowconstrol;

public class ForDemo {
    public static void main(String[] args) {
//        for (int i = 5; i >= 1; i--) {
//            System.out.println(i);
//        }
        
        //1-100之间偶数的和
        int evenSum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                evenSum += i;
            }
        }
        System.out.println("1-100之间偶数的和为"+evenSum);
        
        int oddSum =0;
        for (int i = 1; i <= 100; i=i+2) {
            oddSum += i;
        }
        System.out.println("1-100之间奇数的和为"+oddSum);
    }
}
