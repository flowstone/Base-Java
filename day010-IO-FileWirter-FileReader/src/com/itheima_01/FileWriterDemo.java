package com.itheima_01;

import java.io.FileWriter;
import java.io.IOException;

/**
 * �������ļ���д����
 * @author Yao Xue
 * @date Jul 8, 2017 9:45:39 AM
 */
public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        //�����������
        FileWriter fw = new FileWriter("itheima.txt");
        
        //дһ���ַ���
        fw.write("IO�����");
        
        //����û��ֱ��д���ļ�����ʵ��д���ڴ滺����
        fw.flush();
        
        //�ͷ���Դ
        fw.close();
    }
}



