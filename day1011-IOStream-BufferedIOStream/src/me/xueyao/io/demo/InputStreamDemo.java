package me.xueyao.io.demo;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Aug 1, 2017 4:33:40 PM
 */
public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("D:\\Temp\\Temp\\test1\\1.txt");
        
        int b = 0;
        while ((b = fis.read())!=-1) {
            System.out.println((char)b);
        }
    }
}
