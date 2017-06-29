package org.xueyao.flowcontrol;
/*
 * 打印100-999之间的水仙花数 
 * 如何判断一个数是否是水仙花数
 * 153 = 1*1*1 + 5*5*5 + 3*3*3;
 */
public class ForDaffodil {
    public static void main(String[] args) {
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
