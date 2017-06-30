package org.xueyao.debug;
/**
 * 参数如果是基本数据类型：
 *      形式参数的改变不影响实际参数
 * @author Yao Xue
 * @date Jun 30, 2017 5:25:10 PM
 */
public class DebugChange {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("a:"+a+",b"+b);
        change(a, b);
        System.out.println("a:"+a+",b:"+b);
    }
    
    public static void change(int a, int b) {
        System.out.println("a:"+a+",b:"+b);
        a = b;
        b = a + b;
        System.out.println("a:"+a+",b:"+b);
    }
}
