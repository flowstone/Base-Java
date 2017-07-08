package org.xueyao.filereader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ���󣺴��ļ��ж�ȡ���ݲ���ʾ������̨
 *      ������ -- ������ --FileReader
 * FileReader:
 *      FileReader(String fileName):�����ļ�����
 *      
 * ���������ļ��Ĳ��裺
 *      A����������������
 *      B����������������Ķ����ݷ���
 *      C���ͷ���Դ
 * @author Yao Xue
 * @date Jul 7, 2017 10:53:18 PM
 */
public class FileReaderDemo {
    public static void main(String[] args) throws IOException {
        //��������������
        //FileReader fr = new FileReader("a.txt");
        FileReader fr = new FileReader("FileReaderDemo.java");
        /*
        //��������������Ķ����ݷ���
        //int read():һ�ζ�ȡһ���ַ�
        //��һ�ζ�ȡ����
        int ch = fr.read();
        System.out.println(ch);
        System.out.println((char)(ch));
        
        //�ڶ��ζ�����
        ch = fr.read();
        System.out.println(ch);
        System.out.println((char)(ch));
        
      //�����ζ�����
        ch = fr.read();
        System.out.println(ch);
        System.out.println((char)(ch));
        */
        //���ʱ�����Ƿ��ִ�����ظ��Ⱥܸߣ�����ѭ���Ľ������ǲ�֪��ѭ���Ľ���������ʲô
        //ͨ�����ԣ�����֪���������ȡ���ݵķ���ֵ��-1��ʱ�򣬾�˵��û������ �ˣ���Ҳ��ѭ���Ľ��� ����
        
        int ch;
        while ((ch = fr.read())!=-1) {
            //System.out.println(ch);
            System.out.print((char)(ch));
        }
        
    }
}
