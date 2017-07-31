package org.xueyao.work.file;
/**
 * 求1到n的和(n>=100 && n<=200)
 * @author Yao Xue
 * @date Jul 30, 2017 8:32:27 PM
 */
public class Test09 {
    public static void main(String[] args) {
        int sum = getSum(100);
        System.out.println(sum);
    }
    
    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n+getSum(n-1);
        
    }
}
