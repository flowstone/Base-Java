package org.xueyao.io.print.demo;

import java.io.FileOutputStream;
import java.io.PrintWriter;

/**
 * @author Yao Xue
 * @date Aug 2, 2017 6:59:49 PM
 */
public class PrintWriterDemo {
    public static void main(String[] args) throws Exception {
        /*
         * 不带自动刷新
        PrintWriter pw = new PrintWriter("b.txt");
        pw.print("今天天气真好");
        pw.print("天气真热");
        pw.flush();
        pw.close();*/
        
        //自动刷新
        PrintWriter pw = new PrintWriter(new FileOutputStream("c.txt"), true);
        pw.print("小明");
        pw.print("小红");
        pw.print("小马");
        //调用后才能启动自动刷新
        pw.println();
        pw.close();
    }
}
