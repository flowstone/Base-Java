package com.itheima_01;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *  1. 复制文本文件的5种方式
    A:利用基本流一次读写一个字符
    B:利用基本流一次读写一个字符数组
    C:利用缓冲流一次读写一个字符
    D:利用缓冲流一次读写一个字符数组
    E:利用缓冲流的特有方法一次读写一个字符串
 * @author Yao Xue
 * @date Jul 8, 2017 6:22:30 PM
 */
public class CopyFileFiveMethod {
    public static void main(String[] args) throws IOException {
        String srcFile = "FileWriterDemo.java";
        String destDir = "copyFile";
        CopyFileMethod1(srcFile,destDir);
        CopyFileMethod2(srcFile,destDir);
        CopyFileMethod3(srcFile,destDir);
        CopyFileMethod4(srcFile,destDir);
        CopyFileMethod5(srcFile,destDir);
    }
    
    //A:利用基本流一次读写一个字符
    private static void CopyFileMethod1(String srcFile, String destDir) throws IOException {
        // TODO Auto-generated method stub
        FileReader fileReader = new FileReader(srcFile);
        FileWriter fileWriter = new FileWriter(destDir);
        
        int ch;
        while ((ch = fileReader.read())!= -1) {
            fileWriter.write(ch);
        }
        fileWriter.close();
        fileReader.close();
    }
    //B:利用基本流一次读写一个字符数组
    private static void CopyFileMethod2(String srcFile, String destDir) {
        // TODO Auto-generated method stub
        
    }

    private static void CopyFileMethod3(String srcFile, String destDir) {
        // TODO Auto-generated method stub
        
    }

    private static void CopyFileMethod4(String srcFile, String destDir) {
        // TODO Auto-generated method stub
        
    }

    private static void CopyFileMethod5(String srcFile, String destDir) {
        // TODO Auto-generated method stub
        
    }
}
