package org.xueyao.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * �ڶ��⣺�����������󣬲��ô���ʵ��
    1.��e:\\a.txt���Ƶ�d:\\��Ŀ¼��
    2.�ö��ַ�ʽʵ�ָ���
        (1)ʹ���ַ������ַ�ѭ������
        (2)ʹ���ַ��������ַ�����ʵ�ָ���
        (3)ʹ�ø�Ч�ַ�������ʵ�ָ���
            
 * @author Yao Xue
 * @date Jul 8, 2017 4:37:33 PM
 */
public class HomeWork_02 {
    public static void main(String[] args) throws IOException {
        String srcDir = "a.txt";
        String destDir = "d:\\a.txt";
        //(1)ʹ���ַ������ַ�ѭ������
        //CopyFile1(srcDir,destDir);
        //(2)ʹ���ַ��������ַ�����ʵ�ָ���
        //CopyFile2(srcDir,destDir);
        // (3)ʹ�ø�Ч�ַ�������ʵ�ָ���
        CopyFile3(srcDir,destDir);
        
    }
    // (3)ʹ�ø�Ч�ַ�������ʵ�ָ���
    private static void CopyFile3(String srcDir, String destDir) throws IOException {
        // TODO Auto-generated method stub
        BufferedReader bufferedReader = new BufferedReader(new FileReader(srcDir));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destDir));
        
        int ch;
        while ((ch=bufferedReader.read())!=-1) {
            bufferedWriter.write(ch);
        }
        bufferedWriter.close();
        bufferedReader.close();
        
    }
    //(2)ʹ���ַ��������ַ�����ʵ�ָ���
    private static void CopyFile2(String srcDir, String destDir) throws IOException {
        // TODO Auto-generated method stub
        FileReader fileReader = new FileReader(srcDir);
        FileWriter fileWriter = new FileWriter(destDir);
        
        char[] chs = new char[1024];
        int len;
        while ((len=fileReader.read(chs))!=-1) {
            fileWriter.write(chs, 0, len);
        }
        fileWriter.close();
        fileReader.close();
    }

    //(1)ʹ���ַ������ַ�ѭ������
    private static void CopyFile1(String srcDir, String destDir) throws IOException {
        // TODO Auto-generated method stub
        FileReader fileReader = new FileReader(srcDir);
        FileWriter fileWriter = new FileWriter(destDir);
        
        int ch;
        while ((ch=fileReader.read())!= -1) {
            fileWriter.write(ch);
        }
        fileWriter.close();
        fileReader.close();
    }
    
}
