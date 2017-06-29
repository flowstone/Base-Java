package org.xueyao.flowcontrol;
/*
 * continue:继续的意思
 * 
 * 使用场景：
 *      循环中
 */
public class ContinueDemo {
    public static void main(String[] args) {
        for (int x = 1; x <=10; x++) {
            if (x == 3) {
                continue;
            }
            System.out.println("HelloWorld");
        }
    }
}
