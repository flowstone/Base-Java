package com.itheima_01;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Jul 8, 2017 11:31:41 AM
 */
public class FileReaderDemo1Copy {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("itheima.txt");
        
        int ch;
        while ((ch = fileReader.read()) != -1) {
            System.out.print((char)ch);
        }
        
        fileReader.close();
    }
}
