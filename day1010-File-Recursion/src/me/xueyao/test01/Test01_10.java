package me.xueyao.test01;
/**
 * @author Yao Xue
 * @date Jul 31, 2017 3:24:25 PM
 */
public class Test01_10 {
    public static void main(String[] args) {
        int result = jc(5);
        System.out.println(result);
    }
    public static int jc(int n) {
        if (n == 1) {
            return 1;
        }
        return n * jc(n -1);
    }
}
