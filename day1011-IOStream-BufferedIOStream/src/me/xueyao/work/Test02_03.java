package me.xueyao.work;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 在C盘下创建一个目录d1,在目录d1下创建创建若干个文本文件，并在每一个文本文件中添加若干内容。
 * 利用字节高效流将该目录下的所有文件复制到C盘下的d2目录下。
 * @author Yao Xue
 * @date Aug 2, 2017 9:38:54 AM
 */
public class Test02_03 {
    public static void main(String[] args) throws IOException {
        //创建文件对象 
        File dir = new File("D:\\Temp\\Temp\\test1");
        //获得该文件下的所有文件
        File[] files = dir.listFiles();
        //创建目标文件
        File destDir = new File("D:\\Temp\\Temp\\test2");
        //遍历文件数组 
        for (File file : files) {
            //创建高效字节输入流
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            //创建高效字节输出流
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(destDir, file.getName())));
            
            //定义字节数组接收读取的字节数
            byte[] buffer = new byte[1024];
            // 定义变量接收实际读取的字节数
            int len = -1;
            //从输入流中循环读取数据
            while ((len = bis.read(buffer))!= -1) {
                //利用输入流将数据写出到目标文件中
                bos.write(buffer, 0, len);
            }
            //释放资源
            bis.close();
            bos.close();
        }
    }
}
