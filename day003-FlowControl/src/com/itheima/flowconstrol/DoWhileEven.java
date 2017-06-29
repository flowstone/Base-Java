package com.itheima.flowconstrol;

/*
 * 1-10之间偶数和
 */
public class DoWhileEven {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i = 1;
        int sum = 0;
        do {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        } while (i <= 10);
        
        System.out.println("1-10之间偶数和为"+sum);
    }

}
