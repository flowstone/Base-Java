package org.xueyao.io.task;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**利用高效字节输出流往C盘下的e.txt文件写出一个字节数组数据，如写出：”i love java”
 * @author Yao Xue
 * @date Aug 1, 2017 9:37:08 PM
 */
public class Task01_09 {
    public static void main(String[] args) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D:\\Temp\\Temp\\test1\\b.txt"));
        bos.write("i love java".getBytes());
        bos.close();
        
    }
}
