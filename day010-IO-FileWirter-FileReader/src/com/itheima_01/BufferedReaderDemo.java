package com.itheima_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Jul 8, 2017 4:05:03 PM
 */
public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("FileWriterDemo.java"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("xiaomin.txt"));
        /* ÿ�ζ�ȡһ���ַ�
        int len;
        while ((len = bufferedReader.read()) != -1) {
            bufferedWriter.write(len);
        }
        */
        
        /**
         * ÿ�ζ�ȡ1024���ַ�
         */
        char[] chs = new char[1024];
        int len;
        
        while ((len = bufferedReader.read(chs)) != -1) {
            bufferedWriter.write(new String(chs,0,len));
        }
        
        bufferedWriter.close();
        bufferedReader.close();
    }
}
