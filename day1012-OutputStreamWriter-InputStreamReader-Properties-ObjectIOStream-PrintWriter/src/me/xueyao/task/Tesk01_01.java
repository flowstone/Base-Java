package me.xueyao.task;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 从键盘接收用户输入的一行字符串，将这行字符串写入到C盘下a.txt文件中
要求：一次写出一个字符。

 * @author Yao Xue
 * @date Aug 4, 2017 10:47:19 AM
 */
public class Tesk01_01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行字符串:");
        String line = sc.nextLine();
        
        FileWriter fw = new FileWriter("D:\\Temp\\Temp\\a.txt");
        
        for (int i = 0; i < line.length(); i++) {
            fw.write(line.charAt(i));
        }
        
        fw.close();
    }
}
