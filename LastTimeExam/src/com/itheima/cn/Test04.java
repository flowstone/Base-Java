package com.itheima.cn;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 4 . 
1. 项目根路径创建1个文件data.txt，用于存放程序写入的字符串 （文件的创建可以手动创建，无需使用程序创建）
2. 使用循环语句，循环写入4个键盘录入的字符串到文件data.txt中，写入字符串之前需要提示当前录入的是第几个字符串
演示格式具体如下：图1为输入演示，图2为data.txt存入字符串的格式
 * @author Yao Xue
 * @date Jul 8, 2017 7:43:41 PM
 */
public class Test04 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("data.txt"));
        String[] str = new String[4];
        for (int i = 0; i < 4; i++) {
            System.out.println("请输入第"+(i+1)+"字符串");
            str[i] = sc.nextLine();
            bufferedWriter.write(str[i]);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
        
    }
}
