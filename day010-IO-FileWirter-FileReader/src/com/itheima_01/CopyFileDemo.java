package com.itheima_01;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Jul 8, 2017 11:50:11 AM
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("itheima.txt");
        FileWriter fileWriter = new FileWriter("itheimaCopy.txt");
        //FileWriter fileWriter = new FileWriter("itheima.txt");
        
        int chs;
        while ((chs = fileReader.read()) != 1) {
            fileWriter.write(chs);
        }
        fileWriter.close();
        fileReader.close();
    }
}
