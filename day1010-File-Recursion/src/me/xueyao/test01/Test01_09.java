package me.xueyao.test01;
/**
 * @author Yao Xue
 * @date Jul 31, 2017 3:21:16 PM
 */
public class Test01_09 {
    public static void main(String[] args) {
        int result = sum(100);
        System.out.println(result);
    }
    
    public static int sum(int n) {
        //递归出口
        if (n == 1) return 1;
        return n + sum(n - 1);
    }
}
