package org.xueyao.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 需求：从文件中读取数据并显示到控制台
 *      读数据 -- 输入流 --FileReader
 * FileReader:
 *      FileReader(String fileName):传递文件名称
 *      
 * 输入流读文件的步骤：
 *      A：创建输入流对象
 *      B：调用输入流对象的读数据方法
 *      C：释放资源
 * @author Yao Xue
 * @date Jul 7, 2017 10:53:18 PM
 */
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        //创建输入流对象
        //FileReader fr = new FileReader("a.txt");
        FileReader fr = new FileReader("FileReaderDemo.java");
        /*
        //调用输入流对象的读数据方法
        //int read():一次读取一个字符
        //第一次读取数据
        int ch = fr.read();
        System.out.println(ch);
        System.out.println((char)(ch));
        
        //第二次读数据
        ch = fr.read();
        System.out.println(ch);
        System.out.println((char)(ch));
        
      //第三次读数据
        ch = fr.read();
        System.out.println(ch);
        System.out.println((char)(ch));
        */
        //这个时候，我们发现代码的重复度很高，想用循环改进，但是不知道循环的结束条件是什么
        //通过测试，我们知道，如果读取数据的返回值是-1的时候，就说明没有数据 了，这也是循环的结束 条件
        
        int ch;
        while ((ch = fr.read())!=-1) {
            //System.out.println(ch);
            System.out.print((char)(ch));
        }
        
    }
}
