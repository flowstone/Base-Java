package com.itheima;
/**
 * ����һ����������һ����������ӡ��1-n֮�����
 * @author Yao Xue
 * @date Jul 1, 2017 2:40:05 PM
 */
public class MethodVoid {
    public static void main(String[] args) {
        printN(10);
    }
    
    public static void printN(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
