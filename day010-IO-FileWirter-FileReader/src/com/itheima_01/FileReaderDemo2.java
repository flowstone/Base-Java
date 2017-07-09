package com.itheima_01;

import java.io.FileReader;
import java.io.IOException;


/**
 * @author Yao Xue
 * @date Jul 8, 2017 1:03:08 PM
 */
public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("FileWriterDemo.java");
        
        char[] chs = new char[1024];
        /*int len;
        while ((len = fileReader.read(chs))!=-1) {
            System.out.print(chs);
        }*/
        
        while ((fileReader.read(chs))!=-1) {
            System.out.print(chs);
        }
    }
}
