package org.xueyao.io.task;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 利用高效字节输入流和高效字节输出流完成文件的复制。
要求：
1.将C盘下的c.png文件复制到D盘下
2.一次读写一个字节数组方式复制

 * @author Yao Xue
 * @date Aug 1, 2017 9:59:54 PM
 */
public class Task01_11 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Temp\\Temp\\test.png"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\Temp\\Temp\\test.png"));
        
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len=bis.read(buf))!=-1) {
            bos.write(buf, 0, len);
        }
        
        bis.close();
        bos.close();
    }
}
