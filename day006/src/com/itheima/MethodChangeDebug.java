package com.itheima;
/**
 * @author Yao Xue
 * @date Jul 2, 2017 11:22:17 AM
 */
public class MethodChangeDebug {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        
        change(a,b);
    }

    public static void change(int a, int b) {
        a = a + 10;
        b = a + 10;    
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
    
}
