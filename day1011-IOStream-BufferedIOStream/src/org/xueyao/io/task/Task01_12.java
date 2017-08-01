package org.xueyao.io.task;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 四种复制文件方式比较
1.字节流复制文件一次读写一个字节
2.字节流复制文件一次读写一个字节数组
3.高效流复制文件一次读写一个字节
4.高效流复制文件一次读取一个字节数组
利用上面四种方式复制同一个文件，输出每一种复制方式花费的时间。

 * @author Yao Xue
 * @date Aug 1, 2017 10:07:25 PM
 */
public class Task01_12 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Temp\\Temp\\test.mp3");
        FileOutputStream fos = new FileOutputStream("F:\\Temp\\Temp\\test.mp3");
        long start = System.currentTimeMillis();
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = fis.read(buf))!= -1) {
            fos.write(buf, 0, len);
        }
        fis.close();
        fos.close();
        
    }
}
