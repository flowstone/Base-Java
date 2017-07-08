package org.xueyao.filewriter;

import java.io.FileWriter;
import java.io.IOException;

/**
 * void write(String str) дһ���ַ�������
 * void write(String str,int index,int len) дһ���ַ����е�һ��������
 * void write(int ch) дһ���ַ�����
 * void write(char[] chs) дһ���ַ���������
 * void write(char[] chs,int index,int len) дһ���ַ������һ��������

 * @author Yao Xue
 * @date Jul 7, 2017 8:01:44 PM
 */
public class FileWriterDemo3 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c.txt");
        
        //fw.write("abcde");
        
        //fw.write("abcde", 0, 5);
        //fw.write("abcde", 1, 3);
        
        //fw.write('a');
        //fw.write(97);
        
        //char[] chs = {'a','b','c','d','e'};
        //fw.write(chs);
        
        char[] chs = {'a','b','c','d','e'};
        fw.write(chs,0,5);
        fw.write(chs,2,3);
        fw.close();
    }
}
