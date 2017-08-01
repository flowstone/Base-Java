package org.xueyao.io.task;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 利用字节输入流读取C盘文件b.txt的内容，使用循环读取，一次读取一个字节数组，直到读取到文件末尾，
 * 将读取到的字节数组转换成字符串输出到控制台。
 * 步骤:
 * 1.创建FileInputStream对象
 * 2.定义一个字节数组
 * 3.定义读取字节的个数
 * 4.循环
 * 5.释放资源
 * @author Yao Xue
 * @date Aug 1, 2017 8:55:32 PM
 */
public class Task01_05 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Temp\\Temp\\test1\\c.txt");
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = fis.read(buf))!= -1) {
            System.out.println(new String(buf, 0, len));
        }
        fis.close();
    }
}
