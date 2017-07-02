package org.xueyao.newhomework;
/**
 * 
第二题：分析以下需求，并用代码实现
    求1-500之内能同时被2，5，7整除的所有数，要求 1 行 打印 5个。
 * @author Yao Xue
 * @date Jul 2, 2017 9:08:42 PM
 */
public class HomeWork_02 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 500; i++) {
            if (i % 2 == 0 && i % 5 == 0 && i % 7 == 0) {
                count++;
                System.out.print(i+" ");
                if (count == 5) {
                    System.out.println();
                }
                
            }
        }
    }
}
