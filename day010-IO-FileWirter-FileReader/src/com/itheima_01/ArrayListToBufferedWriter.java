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
        
        arrayList.add("��ǰ���¹�");
        arrayList.add("���ǵ���˪");
        arrayList.add("��ͷ������");
        arrayList.add("��ͷ���¸�");
        
        for (int i = 0; i < arrayList.size(); i++) {
            bufferedWriter.write(arrayList.get(i));
            bufferedWriter.newLine();
        }
        
        bufferedWriter.close();
    }
}
