package org.xueyao.io.stream.rw;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Yao Xue
 * @date Aug 2, 2017 3:30:57 PM
 */
public class InputStreamReadDemo {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("D:\\Temp\\Temp\\utf-8.txt"),"utf-8");
        char[] buff = new char[1024];
        int len = -1;
        while ((len = isr.read(buff))!= -1) {
            System.out.println(new String(buff, 0, len));
        }
        isr.close();
    }
}
