package org.xueyao.io.print.demo;

import java.io.PrintStream;

/**
 * @author Yao Xue
 * @date Aug 2, 2017 6:55:04 PM
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws Exception {
        /*PrintStream out = System.out;
        out.println("hello");*/
        
        PrintStream ps = new PrintStream("a.txt");
        ps.println("小明");
        ps.println("小华");
        //自动刷新
        ps.close();
    }
}
