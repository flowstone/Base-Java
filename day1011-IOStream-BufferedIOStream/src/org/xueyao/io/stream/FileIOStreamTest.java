package org.xueyao.io.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 把D:\\Temp\\Temp\\test.mp3 拷贝到F盘下
 * @author Yao Xue
 * @date Aug 1, 2017 10:21:35 AM
 */
public class FileIOStreamTest {
    public static void main(String[] args) throws IOException {
        //创建输入流对象,关联源文件
        FileInputStream fis = new FileInputStream("D:\\Temp\\Temp\\test.mp3");
        //创建输出流对象 关联目标文件
        FileOutputStream fos = new FileOutputStream("F:\\test.mp3");
        //获取开始 复制的时间
        long start = System.currentTimeMillis();
        //定义数组 读数据
        byte[] b = new byte[1024];
        int len = 0;
        while((len=fis.read(b)) != -1) {
            //写数据
            fos.write(b,0,len);
        }
        //获取结束复制的时间
        long end = System.currentTimeMillis();
        System.out.println("复制时间是:"+(end-start));
        //关闭资源
        fis.close();
        fos.close();
    }
}
