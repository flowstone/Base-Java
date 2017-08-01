package me.xueyao.io.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Aug 1, 2017 8:06:23 PM
 */
public class InputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Temp\\Temp\\test1\\1.txt");
        byte[] buf = new byte[1024];
        int len = 0;
        while ((len=fis.read(buf))!= -1) {
            System.out.println(new String(buf,0,len));
        }
        fis.close();
    }
}
