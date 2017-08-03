package me.xueyao.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * 使用字节流读取字符数据问题演示
 * 
 * abc你好
 * abc?
 * 愫?
 * 
 * ?表示未知字符
 * 
 * 字符流读取字符数据不会出现乱码问题：
 * 因为字符流=字节流+编码表
 * @author Yao Xue
 * @date Aug 3, 2017 8:47:26 AM
 */
public class ReaderDemo {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        method2();
    }

    private static void method2() throws Exception {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\Temp\\Temp\\copy.txt");
        byte[] buf = new byte[4];
        int len = 0;
        while ((len = fis.read(buf))!= -1) {
            System.out.println(new String(buf, 0,len));
        }
        fis.close();
    }
    
    //读取文件D:\\Temp\\Temp\\copy.txt
    public static void method1() throws Exception {
        //创建字节输入流对象
        FileInputStream fis = new FileInputStream("D:\\Temp\\Temp\\copy.txt");
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());
        System.out.println(fis.read());
        //释放资源
        fis.close();
        
    }

}
