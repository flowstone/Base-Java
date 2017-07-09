package com.itheima_01;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Jul 8, 2017 11:17:47 AM
 */
public class FileReaderDemo1 {
    public static void main(String[] args) throws IOException {
        //创建输入对象
        FileReader fr = new FileReader("itheima.txt");
        /*
        int ch = fr.read();
        System.out.println(ch);
        System.out.println((char)(ch));
        */
        
        int ch;
        while ((ch=fr.read())!=-1) {
            //System.out.println(ch);
            System.out.print((char)(ch));
        }
        
        fr.close();
        
        
    }
}
