package org.xueyao.filewriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 输出流写数据的步骤：
 *      A：创建输出流对象
 *      B：调用输出流对象的写数据方法，并刷新缓冲区
 *      C：释放资源
 *      
 *  相对路径： 相对当前项目而言的，在项目的根目录下
 *  绝对路径 ：以盘符开始的路径
 *  
 *  close()和flush()方法的区别：
 *      flush():刷新缓冲区
 *      close()：先刷新缓冲区，然后通知系统释放资源
 * @author Yao Xue
 * @date Jul 6, 2017 9:34:19 PM
 */
public class FileWriterDemo2 {
    public static void main(String[] args) throws IOException {
        //创建输出流对象
        FileWriter fw = new FileWriter("b.txt");
        
        //调用输出流对象的写数据方法，并刷新缓冲区
        fw.write("helloworld");
        fw.flush();
        fw.write("java");
        fw.flush();
        //释放资源
        fw.close();
    }
}
