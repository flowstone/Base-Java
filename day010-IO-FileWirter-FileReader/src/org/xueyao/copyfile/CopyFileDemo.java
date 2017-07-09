package org.xueyao.copyfile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * ����
 *      ����Ŀ·���µ�FileWriterDemo.java �е����ݸ��Ƶ���Ŀ·���µ�Copy.java
 *      
 * ����Դ��
 *      FileWriterDemo.java --������ --FileReader
 * Ŀ�ĵأ�
 *      Copy.java -- д���� -- FileWriter
 * @author Yao Xue
 * @date Jul 8, 2017 8:30:43 AM
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        //��������������
        FileReader fr = new FileReader("FileWriterDemo.java");
        
        //�������������
        FileWriter fw = new FileWriter("Copy.java");
        
        //������
        int ch;
        while ((ch = fr.read())!=-1) {
            fw.write(ch);
        }
        
        //�ͷ���Դ
        fw.close();
        fr.close();
    }
}
