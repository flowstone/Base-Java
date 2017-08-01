package org.xueyao.io.task;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 利用高效字节输入流和高效字节输出流完成文件的复制。
要求：
1.将C盘下的b.png文件复制到D盘下
2.一次读写一个字节方式复制

 * @author Yao Xue
 * @date Aug 1, 2017 9:43:15 PM
 */
public class Task01_10 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Temp\\Temp\\test.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\Temp\\Temp\\test.png"));
        
        int b = 0;
        while ((b = bis.read())!=-1) {
            bos.write(b);
            bos.flush();
        }
        bos.close();
        bis.close();
    }
}
