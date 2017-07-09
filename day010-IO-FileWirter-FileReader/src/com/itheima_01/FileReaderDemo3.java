package com.itheima_01;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Jul 8, 2017 2:41:05 PM
 */
public class FileReaderDemo3 {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("FileWriterDemo.java");
        FileWriter fileWriter = new FileWriter("lili.txt");
        
        char[] chs = new char[1024];
        
        int len;
        while ((len = fileReader.read(chs)) != -1) {
            fileWriter.write(new String(chs,0,len));
        }
        
        fileWriter.close();
        fileReader.close();
    }
}
