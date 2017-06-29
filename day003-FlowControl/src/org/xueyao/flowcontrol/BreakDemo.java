package org.xueyao.flowcontrol;

/*
 * break:中断的意思 
 * 
 * 使用场景：
 *      A：switch语句中
 *      B：循环中
 */
public class BreakDemo {
    public static void main(String[] args) {
        for (int x = 1; x <=10; x++) {
            if (x == 3) {
                break;
            }
            System.out.println("HelloWorld");
        }
    }
}
