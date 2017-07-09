package com.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Jul 8, 2017 10:49:53 AM
 */
public class FileWriterDemo3 {
    public static void main(String[] args) throws IOException {
        //FileWriter fw = new FileWriter("itheima.txt");
        FileWriter fw = new FileWriter("itheima.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("hello"+i);
            fw.write("\r\n");
        }
        
        fw.close();
    }
}
