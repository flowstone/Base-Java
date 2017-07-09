package org.xueyao.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 第二题：分析以下需求，并用代码实现
    1.将e:\\a.txt复制到d:\\根目录下
    2.用多种方式实现复制
        (1)使用字符流单字符循环复制
        (2)使用字符流利用字符数组实现复制
        (3)使用高效字符缓冲流实现复制
            
 * @author Yao Xue
 * @date Jul 8, 2017 4:37:33 PM
 */
public class HomeWork_02 {
    public static void main(String[] args) throws IOException {
        String srcDir = "a.txt";
        String destDir = "d:\\a.txt";
        //(1)使用字符流单字符循环复制
        //CopyFile1(srcDir,destDir);
        //(2)使用字符流利用字符数组实现复制
        //CopyFile2(srcDir,destDir);
        // (3)使用高效字符缓冲流实现复制
        CopyFile3(srcDir,destDir);
        
    }
    // (3)使用高效字符缓冲流实现复制
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
    //(2)使用字符流利用字符数组实现复制
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

    //(1)使用字符流单字符循环复制
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
