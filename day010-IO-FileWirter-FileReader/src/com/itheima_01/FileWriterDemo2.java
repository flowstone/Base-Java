package com.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Jul 8, 2017 10:45:28 AM
 */
public class FileWriterDemo2 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("itheima.txt");
        
        fw.write("I love Java");
        fw.flush();
        fw.close();
    }
}
