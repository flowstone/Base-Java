package com.itheima_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 计算lulu.txt文本中有多少个小a
 * @author Yao Xue
 * @date Jul 8, 2017 4:52:45 PM
 */
public class BufferedWriterTest2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("lulu.txt"));
        
        String line;
        int count = 0;
        while ((line = bufferedReader.readLine())!=null) {
            char[] arr = line.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 'a') {
                    count++;
                }
            }
        }
        bufferedReader.close();
        System.out.println("count:"+count);
    }
}
