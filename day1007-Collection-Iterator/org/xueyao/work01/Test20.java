package org.xueyao.work01;
/**
 * 统计101-200之间有多少个素数，并输出所有素数。
 * 素数又叫质数，就是除了1和它本身之外，再也没有整数能被它整除的数。
 * @author Yao Xue
 * @date Jul 27, 2017 11:29:01 AM
 */
public class Test20 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 101; i < 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count ++;
                System.out.println(i);
            }
        }
        
        System.out.println("101-200之间有"+count+"素数");
    }
}
