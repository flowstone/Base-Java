package org.xueyao.recursion;
/**
 * @author Yao Xue
 * @date Jul 30, 2017 12:12:55 PM
 */
public class DiGuiDemo {
    public static void main(String[] args) {
        //计算1-num的和,使用递归完成
        int n = 5;
        int sum = getSum(n);
    }
    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + getSum(n-1);
    }
}
