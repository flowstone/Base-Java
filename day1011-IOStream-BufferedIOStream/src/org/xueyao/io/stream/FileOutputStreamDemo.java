package org.xueyao.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Yao Xue
 * @date Aug 1, 2017 8:56:23 AM
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        method_1();
        method_2();
    }
    //需求2:使用字节输出流把字符串数据"hello,锁哥"写到硬盘D:\\Temp\\Temp\\test1\\2.txt上;
    private static void method_2() throws IOException {
        //创建输出流对象
        OutputStream out = new FileOutputStream("D:\\Temp\\Temp\\test1\\2.txt");
        //定义一个字符串
        String s = "hello,锁哥";
        //把字符串转换成字节数据
        byte[] bys = s.getBytes();
        //使用输出流对象调用write函数将数据写到硬盘上指定的文件中
        out.write(bys);
        //关闭资源
        out.close();
        
    }
    //需求1:将一个字节byte数组中的数据写到D:\\Temp\\Temp\\test1\\1.txt的文件中
    private static void method_1() throws IOException {
        //创建字节输出流对象  FileOutputStream(String name)
        /*
         * public FileOutputStream(String name)throws FileNotFoundException {
         *     this(name != null ? new File(name) : null,false);
         * }
         */
        //经常用底层帮我们将字符串封装成File类的对象
        OutputStream out = new FileOutputStream("D:\\Temp\\Temp\\test1\\1.txt");
        //FileOutputStream(File file)
        //创建File类的对象
        /*
         * File file = new File("D:\\Temp\\Temp\\test1\\1.txt");
         * 创建输出流对象    不经常使用
         * FileOutputStream out = new FileOutputStream(file);
         */
        //创建一个字节数组
        byte[] b = {97,98,65,66};
        //将字节数组中的数据写到指定的文件中
        out.write(b);
        //关闭输出流
        out.close();
    }
}
