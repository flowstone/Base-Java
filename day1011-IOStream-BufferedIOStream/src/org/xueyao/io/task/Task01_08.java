package org.xueyao.io.task;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 利用高效字节输出流往C盘下的d.txt文件输出一个字节数。
 * @author Yao Xue
 * @date Aug 1, 2017 9:31:56 PM
 */
public class Task01_08 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Temp\\Temp\\test1\\b.txt"));
        bos.write("你好,我是小明".getBytes());
        bos.close();
        
    }
}
