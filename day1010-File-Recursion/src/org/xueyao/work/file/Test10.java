package org.xueyao.work.file;
/**
 * 求整数n的阶乘(n <=10)
 * @author Yao Xue
 * @date Jul 30, 2017 8:35:40 PM
 */
public class Test10 {
    public static void main(String[] args) {
        int jc = getJc(10);
        System.out.println(jc);
    }
    
    public static int getJc(int n) {
        if (n == 1) {
            return 1;
        }
        return n * getJc(n-1);
    }
}
