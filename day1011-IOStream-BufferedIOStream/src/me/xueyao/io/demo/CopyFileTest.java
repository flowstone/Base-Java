package me.xueyao.io.demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 把D:\\Temp\\Temp\\test.mp3复制到F:\\Temp下
 * 分析:
 * 源文件:D:\\Temp\\Temp\\test.mp3
 * 目的地:F:\\Temp\\test.mp3
 * 1.创建FileInputStream对象
 * 2.创建FileOutputStream对象
 * 3.定义一个字节数组
 * 4.定义变量保存字节个数
 * 5.读取模板,写数据
 * 6.关闭资源
 * @author Yao Xue
 * @date Aug 1, 2017 7:25:08 PM
 */
public class CopyFileTest {
    public static void main(String[] args) throws IOException {
        //1.创建FileInputStream对象
        FileInputStream fis = new FileInputStream("D:\\Temp\\Temp\\test.mp3");
        //2.创建FileOutputStream对象
        FileOutputStream fos = new FileOutputStream("F:\\Temp\\test.mp3");
        long start = System.currentTimeMillis();
        //3.定义一个字节数组
        byte[] buf = new byte[1024*8];
        //4.定义变量保存字节个数
        int len = 0;
        while ((len = fis.read(buf))!= -1) {
            fos.write(buf,0,len);
        }
        long end = System.currentTimeMillis();
        System.out.println("消耗时间:"+(end-start));
        //6.关闭资源
        fis.close();
        fos.close();
        
    }
}
