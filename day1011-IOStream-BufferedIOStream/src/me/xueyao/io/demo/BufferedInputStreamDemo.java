package me.xueyao.io.demo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Aug 1, 2017 8:13:00 PM
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Temp\\Temp\\test1\\1.txt"));
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len=bis.read(buf))!=-1) {
            System.out.println(new String(buf,0,len));
        }
        bis.close();
    }
}   
