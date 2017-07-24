package me.xueyao.level2_05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Yao Xue
 * @date Jul 24, 2017 12:33:32 PM
 */
public class Test {
    public static void main(String[] args) {
        BufferedReader br = null;
        ArrayList<String> arrayList = new ArrayList<String>();
        try {
            br = new BufferedReader(new FileReader("names.txt"));
            String line;
            try {
                while ((line = br.readLine())!=null) {
                    arrayList.add(line);
                }
            } catch (IOException e) {
                System.out.println("输入输出流异常");
                e.printStackTrace();
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
