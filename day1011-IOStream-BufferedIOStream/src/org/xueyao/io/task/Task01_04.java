package org.xueyao.io.task;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 利用字节输入流读取C盘文件a.txt的内容，使用循环读取，一次读取一个字节，直到读取到文件末尾。
 * 将读取的字节输出到控制台
 * 步骤:
 * 1.创建FileInputStream对象
 * 2.定义一个len存储字节
 * 3.循环读取
 * 4.释放资源
 * @author Yao Xue
 * @date Aug 1, 2017 8:42:11 PM
 */
public class Task01_04 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Temp\\Temp\\test1\\c.txt");
        int len = 0;
        while ((len = fis.read())!= -1) {
            System.out.print((char)len);
        }
        fis.close();
    }
}
