package org.xueyao.filewriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * ���ʵ������ �Ļ���?
 * \n����ʵ�ֻ��У�windowʶ��\r\n
 *  linux:\n
 *  max:\r
 * ���ʵ�����ݵ�׷��д�룿
 *   FileWriter(String filename, boolean append)
 * @author Yao Xue
 * @date Jul 7, 2017 8:18:24 PM
 */
public class FileWriterDemo4 {
    public static void main(String[] args) throws IOException {
        //FileWriter fw = new FileWriter("c.txt");
        FileWriter fw = new FileWriter("c.txt", true); //true��ʾ׷�ӣ�Ĭ����false
        for (int i = 0; i < 10; i++) {
            fw.write("hello"+i);
            fw.write("\r\n");
        }
        
        fw.close();
    }
}
