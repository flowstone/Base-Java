package me.xueyao.io.demo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Aug 1, 2017 8:17:32 PM
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Temp\\Temp\\test1\\1.txt"));
        bos.write("hello,我是测试文档".getBytes());
        bos.close();
    }
}
