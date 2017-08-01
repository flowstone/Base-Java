package org.xueyao.io.task;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 在C盘下有一个文本文件test.txt(里面的内容由数字和字母组成)
定义一个方法统计test.txt文件中指定字符出现的次数。
比如a字符在文件中出现了10次则调用方法传入a后，方法内部输出：a出现10次

步骤:
1.FileInputStream()对象
2.定义len存储每次读取的字节
3.定义一个整数变量统计字符出现的次数,将读取的字节和传入的字符进行比较
 * @author Yao Xue
 * @date Aug 2, 2017 12:42:13 AM
 */
public class Tesk01_16 {
    public static void main(String[] args) throws IOException {
        count('i');
    }

    private static void count(char ch) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:\\Temp\\Temp\\test1\\c.txt");
            int len = 0;
            int count = 1;
            while ((len = fis.read())!= -1) {
                char c = (char)len;
                if (ch == c) {
                    count ++;
                }
            }
            System.out.println(ch+"总共出现"+count+"次");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                } 
            } catch (IOException e2) {
                // TODO: handle exception
            }
        }
        
    }
}
