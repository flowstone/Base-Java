package com.itheima_01;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Yao Xue
 * @date Jul 8, 2017 5:29:29 PM
 */
public class ArrayListToBufferedWriter {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<String>();
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ganggang.txt"));
        
        arrayList.add("床前明月光");
        arrayList.add("疑是地上霜");
        arrayList.add("举头望明月");
        arrayList.add("低头郭德纲");
        
        for (int i = 0; i < arrayList.size(); i++) {
            bufferedWriter.write(arrayList.get(i));
            bufferedWriter.newLine();
        }
        
        bufferedWriter.close();
    }
}
