package org.xueyao;
/**
 * 【程序2】
题目：判断101-200之间有多少个素数，并输出所有素数。
素数：只能被1和本身整除的数叫做素数

 * @author Yao Xue
 * @date Jul 1, 2017 1:51:10 PM
 */
public class PrimeNumber_02 {
    public static void main(String[] args) {
        PrintPrime(1,9);
    }
    
    public static void PrintPrime(int n, int m) {
        int count = 0;
        for (int i = n; i <=m ; i++) {
            int flag = 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                count++;
                System.out.println(i+"是素数");
            }
        }
        System.out.println(n+"-"+m+"之间有"+count+"个素数");
    }
}


