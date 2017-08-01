package org.xueyao.io.task;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 用字节流将C盘下的a.png图片复制到D盘下(文件名保存一致)
要求：一次读写一个字节数组的方式进行复制
步骤:
1.创建FileInputStream()对象
2.创建FileOutputStream()对象
3.定义一个字节数组
4.定义一个变量存储字节个数
5.while循环输入字节数组
6.循环输出字节数组
7.释放资源
 * @author Yao Xue
 * @date Aug 1, 2017 9:19:28 PM
 */
public class Task01_07 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Temp\\Temp\\test.png");
        FileOutputStream fos = new FileOutputStream("F:\\Temp\\Temp\\test.png");
        
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = fis.read(buf))!=-1) {
            fos.write(buf, 0 , len);
            
        }
        fis.close();
        fos.close();
    }
}
