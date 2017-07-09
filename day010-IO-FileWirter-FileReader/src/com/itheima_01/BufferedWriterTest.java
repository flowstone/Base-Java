package com.itheima_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ͨ���ı���ȡcc.txt�ļ����Լֿ�ͷ���ַ����������
 * @author Yao Xue
 * @date Jul 8, 2017 4:28:12 PM
 */
public class BufferedWriterTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("cc.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("jia.txt"));
        
        String line;
        while ((line = bufferedReader.readLine())!=null) {
            if (line.startsWith("��")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }
        
        bufferedWriter.close();
        bufferedReader.close();
    }
}
