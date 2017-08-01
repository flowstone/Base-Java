package org.xueyao.io.task;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 利用字节输出流一次写一个字节的方式向C盘的a.txt文件输出内容。
 * 目标文件: D:\\Temp\\Temp\\a.txt
 * 步骤:
 * 1.创建 FileOutputStream对象
 * 2.定一个字节的内容
 * 3.调用write方式,输出到a.txt文件中
 * 4.释放资源
 * @author Yao Xue
 * @date Aug 1, 2017 7:50:41 PM
 */
public class Task01_01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\Temp\\Temp\\a.txt");
        byte b = 97;
        fos.write(b);
        fos.close();
    }
}
