package com.itheima_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 通过文本读取cc.txt文件中以贾开头的字符串，并输出
 * @author Yao Xue
 * @date Jul 8, 2017 4:28:12 PM
 */
public class BufferedWriterTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("cc.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("jia.txt"));
        
        String line;
        while ((line = bufferedReader.readLine())!=null) {
            if (line.startsWith("贾")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }
        
        bufferedWriter.close();
        bufferedReader.close();
    }
}
