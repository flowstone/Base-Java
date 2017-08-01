package org.xueyao.io.task;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 利用字节流将C盘下的a.png图片复制到D盘下(文件名保存一致)
要求：
1.一次读写一个字节的方式
步骤:
源地址: D:\\Temp\\Temp\\test.png
目标地址: F:\\Temp\\test.png
1.创建FileInputStream对象
2.创建FileOutputStream对象
3.定一个变量存储一个字节
4.while 读取一个字节
5.write 读出一个字节的数据
6.释放资源
 * @author Yao Xue
 * @date Aug 1, 2017 9:03:18 PM
 */
public class Task01_06 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Temp\\Temp\\test.png");
        FileOutputStream fos = new FileOutputStream("F:\\Temp\\test.png");
        int len = 0;
        while ((len = fis.read())!= -1) {
            fos.write(len);
        }
        
        fis.close();
        fos.close();
    }
}
