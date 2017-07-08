package com.itheima_01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Yao Xue
 * @date Jul 8, 2017 6:15:32 PM
 */
public class FileToArrayList {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<String>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("ganggang.txt"));
        
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            arrayList.add(line);
            System.out.println(line);
        }
        
        bufferedReader.close();
    }
}
