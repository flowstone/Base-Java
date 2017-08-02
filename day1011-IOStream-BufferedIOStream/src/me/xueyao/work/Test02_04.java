package me.xueyao.work;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 在C盘下创建一个目录d1,在目录d1下创建若干个txt文件，并在每一个txt文件中添加若干内容。将所有txt文件的内容复制到D盘下的copy.txt中。
* 要求所有txt的文件内容都复制到同一个文件中

 * @author Yao Xue
 * @date Aug 2, 2017 10:01:14 AM
 */
public class Test02_04 {
    public static void main(String[] args) throws IOException {
        //创建文件对象
        File dir = new File("d:\\Temp\\Temp\\test1");
        //获得该 文件下所有文件
        File[] files = dir.listFiles();
        //创建目标文件
        File destFile = new File("d:\\Temp\\Temp\\test2\\copy.txt");
        //遍历文件数组
        for (File file : files) {
            //创建高效字节输入流对象 
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
            //创建高效字节输出流对象
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile, true));
            //定义字节数组接收字节数据
            byte[] buff = new byte[1024];
            //定义变量存储字节数
            int len = -1;
            //从输入流中循环读出数据
            while ((len = bis.read(buff))!= -1) {
                //利用输出流将数据写到目标文件中
                bos.write(buff, 0, len);
            }
            //释放资源
            bis.close();
            bos.close();
        }
    }
}
