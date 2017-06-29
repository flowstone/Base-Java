package org.xueyao.method;
/**
 * @author Yao Xue
 * @date Jun 29, 2017 7:47:24 PM
 */
public class MethodHelloWorld {
    public static void main(String[] args) {
        //单独调用
        //printHelloWorld();
        
        //输出调用
        //System.out.println(printHelloWorld);
    }
    
    public static void printHelloWorld() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("HelloWorld");
        }
    }
}
