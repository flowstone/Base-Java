package com.itheima.cn;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *  1.当前工程根目录下创建data2.txt文件，利用字符输出流往文件中写入12342352.从文件中将内容读取出来，统计内容中字符'3'的个数；
    2.将统计出来的结果输出到控制台上；
 * @author Yao Xue
 * @date Jul 9, 2017 8:38:51 AM
 */
public class Test08 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data2.txt"));
        bufferedWriter.write("12342352");
        bufferedWriter.close();
        
        BufferedReader bufferedReader = new BufferedReader(new FileReader("data2.txt"));
        int ch;
        int count = 0;
        while ((ch=bufferedReader.read())!=-1) {
            if (ch == '3') {
                count++;
            }
        }
        System.out.println("count:"+count);
    }
}
