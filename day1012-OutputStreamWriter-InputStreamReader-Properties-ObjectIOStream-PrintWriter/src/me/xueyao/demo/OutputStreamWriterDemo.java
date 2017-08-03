package me.xueyao.demo;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * OutputStreamWriter 字符转字节输出转换流 内存---》硬盘 字符---》字节
 * 构造方法：
 * OutputStreamWriter(OutputStream out, String charsetName) 创建使用指定字符集的 OutputStreamWriter。
 * 
 * 需求：向指定文件中写数据
 * @author Yao Xue
 * @date Aug 2, 2017 10:09:06 PM
 */
public class OutputStreamWriterDemo {
    public static void main(String[] args) throws Exception {
        method_2();
    }

    //以UTF-8编码写数据
    private static void method_2() throws Exception{
        //创建转换流对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("D:\\Temp\\Temp\\copy.txt"),"utf-8");
        //写数据
        osw.write("hello,我们好牛逼呀");
        //释放资源
        osw.close();
    }
    
    public static void method_1() throws Exception {
        //创建字符输出流对象
        FileWriter fw = new FileWriter("D:\\Temp\\Temp\\copy.txt");
        //写数据
        fw.write("柳岩");
        //释放资源
        fw.close();
    }
}
