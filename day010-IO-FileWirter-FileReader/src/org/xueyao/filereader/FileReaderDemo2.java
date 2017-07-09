package org.xueyao.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 输入流读数据 的步骤
 *  A:创建输入流对象
 *  B：调用输入流对象的读数据方法
 *  C：释放资源
 * @author Yao Xue
 * @date Jul 8, 2017 8:48:55 AM
 */
public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        FileReader fr = new FileReader("FileWriterDemo.java");
        
        //调用输入流对象的读数据方法
        //int read(char[] cbuf): 一次读取一个字符数组的数据
        char[] chs = new char[5];
        //第一次读数据
        int len = fr.read(chs);
        System.out.println("len:"+len);
        System.out.println(new String(chs));
        
        //第二次
        len = fr.read(chs);
        System.out.println("len:"+len);
        System.out.println(new String(chs));
        
       //第三次
        len = fr.read(chs);
        System.out.println("len:"+len);
        System.out.println(new String(chs));
    }
}
