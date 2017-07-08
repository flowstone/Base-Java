package org.xueyao.filewriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 如何实现数据 的换行?
 * \n可以实现换行，window识别\r\n
 *  linux:\n
 *  max:\r
 * 如何实现数据的追加写入？
 *   FileWriter(String filename, boolean append)
 * @author Yao Xue
 * @date Jul 7, 2017 8:18:24 PM
 */
public class FileWriterDemo4 {
    public static void main(String[] args) throws IOException {
        //FileWriter fw = new FileWriter("c.txt");
        FileWriter fw = new FileWriter("c.txt", true); //true表示追加，默认是false
        for (int i = 0; i < 10; i++) {
            fw.write("hello"+i);
            fw.write("\r\n");
        }
        
        fw.close();
    }
}
