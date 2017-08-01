package org.xueyao.io.task;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 利用字节输出流一次写一个字节数组的方式向C盘的b.txt文件输出内容。
 * 目标地: D:\\Temp\\Temp\\b.txt
 * 步骤:
 * 1.创建FileOutputStream对象
 * 2.创建字节数组
 * 3.write方法输出数据到文件中
 * 4.释放资源
 * @author Yao Xue
 * @date Aug 1, 2017 7:55:54 PM
 */
public class Task01_02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\Temp\\Temp\\b.txt");
        byte[] buf = {97,98,68,69};
        fos.write(buf);
        fos.close();
    }
}
