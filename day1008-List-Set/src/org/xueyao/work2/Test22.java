package org.xueyao.work2;
/**
 * 将50元兑换成5元,2元和1元.每种面额的钱不能为0张.共有几种兑换方法.每种兑换方法的钱是怎么样的?
 * @author Yao Xue
 * @date Jul 27, 2017 10:56:46 PM
 */
public class Test22 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 43; i++) {
            for (int j = 1; j <= 22; j++) {
                for (int s = 1; s <= 9; s++) {
                    if (i*1+j*2+s*5 == 50) {
                        count++;
                        System.out.println("5元有"+s+"张,2元有"+j+"张,1元有"+i+"张");
                    }
                }
            }
        }
        System.out.println("总共有"+count+"交换方式");
    }
}
