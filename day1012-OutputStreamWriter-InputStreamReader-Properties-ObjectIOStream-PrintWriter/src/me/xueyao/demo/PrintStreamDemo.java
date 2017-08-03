package me.xueyao.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * 打印流讲解
 * PrintStream: 自带缓冲区,并且自动刷新
 * PrintWriter:自带缓冲区,但是不会自动刷新,但是可以启动自动刷新功能
 * @author Yao Xue
 * @date Aug 3, 2017 9:28:42 AM
 */
public class PrintStreamDemo {
    public static void main(String[] args) throws Exception {
        method2();
        method1();
    }
    /**
     * 不自动刷新
     * @throws Exception 
     */
    private static void method1() throws Exception {
        // TODO Auto-generated method stub
//        PrintWriter pw = new PrintWriter("D:\\Temp\\Temp\\printWriter.txt");
        PrintWriter pw = new PrintWriter(new FileOutputStream("D:\\Temp\\Temp\\printWriter.txt"), true);
        pw.println("我就看看不说话");
        pw.println("不说话看啥");
        pw.println();
        pw.close();
        
    }
    /**
     * 自动刷新
     * @throws Exception
     */
    private static void method2() throws Exception {
        // TODO Auto-generated method stub
        PrintStream ps = new PrintStream("D:\\Temp\\Temp\\printStream.txt");
        ps.print("今天天气真好");
        ps.println("上面说得都是假的");
        ps.close();
    }
}
