package org.xueyao.io.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Yao Xue
 * @date Aug 1, 2017 9:51:30 AM
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws IOException {
        InputStream in = new FileInputStream("D:\\Temp\\Temp\\test1\\1.txt"); 
        int b = 0;
        //in.read()表示使用输入流对象读取字节数据保存到变量b中
        //如果bt等于-1说明已经读取到文件末尾,否则文件中还有数据
        while ((b = in.read()) != -1) {
            //输出字节数据
            System.out.println((char)b);
        }
        //关闭资源
        in.close();
    }
}
