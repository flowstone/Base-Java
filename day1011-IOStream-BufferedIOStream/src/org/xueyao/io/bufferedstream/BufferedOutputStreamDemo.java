package org.xueyao.io.bufferedstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 演示字节输出流缓冲区
 * @author Yao Xue
 * @date Aug 1, 2017 10:48:53 AM
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建可以和底层文件交互的流对象
        FileOutputStream fos = new FileOutputStream("D:\\Temp\\Temp\\test1\\1.txt",true);
        //创建输出流缓冲区对象
        BufferedOutputStream buffOut = new BufferedOutputStream(fos);
        //写入数据
        buffOut.write("今天真好".getBytes());
        //关闭缓冲区输出流
        //buffOut.close();
        //将缓冲区中的数据刷新到输出流中
        buffOut.flush();
        
    }
}
