package com.itheima_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Jul 8, 2017 3:25:50 PM
 */
public class BufferedWriterDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("lili.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("lulu.txt"));
        
        char[] chs = new char[1024];
        int len;
        
        while ((len = bufferedReader.read(chs))!= -1) {
            bufferedWriter.write(new String(chs,0,len));
        }
        
        bufferedWriter.close();
        bufferedReader.close();
    }


}
