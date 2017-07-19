package org.xueyao05.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Yao Xue
 * @date Jul 19, 2017 11:39:18 AM
 */
public class IODemo {
    public static void main(String[] args) throws IOException {
        //method();
        
        BufferedReader bufferedReader = new BufferedReader(new FileReader("def.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("abc.txt"));
        
        String line;
        while ((line = bufferedReader.readLine())!=null) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
        bufferedReader.close();
    }

    public static void method() throws IOException, FileNotFoundException {
        FileWriter fw = new FileWriter("abc.txt");
        FileReader fileReader = new FileReader("def.txt");
        /*
        int ch;
        while ((ch = fileReader.read())!=-1) {
            fw.write(ch);
            fw.flush();
        }
        */
        
        char[] chs = new char[1024];
        int len;
        while ((len = fileReader.read(chs))!= -1) {
            fw.write(chs, 0, len);
            fw.flush();
        }
        fw.close();
        fileReader.close();
    }
}
