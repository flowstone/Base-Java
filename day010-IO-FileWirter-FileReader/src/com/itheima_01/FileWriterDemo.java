package com.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 需求：往文件中写数据
 * @author Yao Xue
 * @date Jul 8, 2017 9:45:39 AM
 */
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建输出对象
        FileWriter fw = new FileWriter("itheima.txt");
        
        //写一个字符串
        fw.write("IO流你好");
        
        //数据没有直接写到文件，其实是写到内存缓冲区
        fw.flush();
        
        //释放资源
        fw.close();
    }
}



