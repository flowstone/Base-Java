package org.xueyao.io.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Aug 1, 2017 10:08:00 AM
 */
public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Temp\\Temp\\test1\\1.txt");
        //数组长度一般是1024的整数倍
        byte[] b = new byte[1024];
        //定义一个变量保存读取字节的个数
        int len = 0;
        //fis.read(b)表示读取的数据都存放到byte数组中了,len表示读取字节数
        while ((len = fis.read(b))!= -1) {
            System.out.println(new String(b,0,len));
        }
        fis.close();
    }
}
