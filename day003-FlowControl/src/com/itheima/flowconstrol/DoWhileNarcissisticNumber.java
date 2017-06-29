package com.itheima.flowconstrol;
/*
 * 用 do...while 实现水仙花案例
 */
public class DoWhileNarcissisticNumber {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int i = 100;
        int count = 0;
        do {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 10 / 10 % 10;
            if (i == (ge*ge*ge + shi*shi*shi + bai*bai*bai)) {
                System.out.println(i);
                count++;
            }
            i++;
        } while (i <= 999);
        System.out.println("水仙花的个数为："+count);
    }

}
