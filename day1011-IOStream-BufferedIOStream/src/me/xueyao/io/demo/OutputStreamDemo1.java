package me.xueyao.io.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Aug 1, 2017 8:01:46 PM
 */
public class OutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\Temp\\Temp\\test1\\1.txt");
        String lineSeparator = System.lineSeparator();
        fos.write((lineSeparator+"hello,我是小明").getBytes());
        fos.close();
    }
}
