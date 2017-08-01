package org.xueyao.io.bufferedstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 演示字节输入流缓冲区
 * @author Yao Xue
 * @date Aug 1, 2017 10:42:12 AM
 */
public class BufferedInputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建一个可以直接和文件进行交互的输入流对象
        FileInputStream fis = new FileInputStream("D:\\Temp\\Temp\\test1\\1.txt");
        //创建输入流缓冲区,指定可以从底层读取数据的流对象
        BufferedInputStream bufin = new BufferedInputStream(fis);
        //创建数组
        byte[] b = new byte[1024];
        //定义一个变量
        int len = 0;
        while ((len = bufin.read(b))!= -1) {
            System.out.println(new String(b,0,len));
        }
        
        //关闭资源
        bufin.close();
    }
}
