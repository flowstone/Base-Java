package me.xueyao.io.demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * FileOutputStream(String file) 开发中常用
 * @author Yao Xue
 * @date Aug 1, 2017 3:37:46 PM
 */
public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStream ops = new FileOutputStream("D:\\Temp\\Temp\\test1\\1.txt");
        
        byte[] buf = {97,98,65,66};
        ops.write(buf);
        String lineSeparator = System.lineSeparator();
        ops.write((lineSeparator+"你好,世界").getBytes());
        ops.close();
    }
}
