package org.xueyao.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ������������ �Ĳ���
 *  A:��������������
 *  B����������������Ķ����ݷ���
 *  C���ͷ���Դ
 * @author Yao Xue
 * @date Jul 8, 2017 8:48:55 AM
 */
public class FileReaderDemo2 {
    public static void main(String[] args) throws IOException {
        //��������������
        FileReader fr = new FileReader("FileWriterDemo.java");
        
        //��������������Ķ����ݷ���
        //int read(char[] cbuf): һ�ζ�ȡһ���ַ����������
        char[] chs = new char[5];
        //��һ�ζ�����
        int len = fr.read(chs);
        System.out.println("len:"+len);
        System.out.println(new String(chs));
        
        //�ڶ���
        len = fr.read(chs);
        System.out.println("len:"+len);
        System.out.println(new String(chs));
        
       //������
        len = fr.read(chs);
        System.out.println("len:"+len);
        System.out.println(new String(chs));
    }
}
