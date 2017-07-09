package org.xueyao.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 第六题：分析以下需求，并用代码实现
    项目根路径下有text.txt文件，内容如下：
            我爱黑马
    123456
    利用IO流的知识读取text.txt文件的内容反转后写入text.txt文件中
 * @author Yao Xue
 * @date Jul 8, 2017 4:40:46 PM
 */
public class HomeWork_06 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("text.txt"));
        
       /* char ch = '张';
        System.out.println(ch);*/
        String line;
        while ((line=bufferedReader.readLine())!=null) {
            
            char[] chs = line.toCharArray();
            for (int i = 0,j=chs.length-1; i <= j; i++,j--) {
                char temp = chs[i];
                chs[i] = chs[j];
                chs[j] = temp;
              
            }
            
            System.out.println(line);
        }
      //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("text.txt"));
    //bufferedWriter.write(line);
        //bufferedWriter.close();
        bufferedReader.close();
    }
}

