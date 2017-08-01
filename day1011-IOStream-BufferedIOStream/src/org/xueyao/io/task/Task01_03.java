package org.xueyao.io.task;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 利用字节输出流对象往C盘下c.txt文件输出5句：”i love java”
要求：
1.不能覆盖文件中原有的内容
2.每一句输出各占一行
步骤
1.创建FileOutputStream对象
2.调用系统的换行符
3.for循环写入数据
4.释放资源
 * @author Yao Xue
 * @date Aug 1, 2017 8:29:08 PM
 */
public class Task01_03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\Temp\\Temp\\test1\\c.txt",true);
        String lineSeparator = System.lineSeparator();
        for (int i=0; i<5; i++) {
            fos.write((lineSeparator+"i love java").getBytes());
           
        }
        fos.close();
        
    }
}
