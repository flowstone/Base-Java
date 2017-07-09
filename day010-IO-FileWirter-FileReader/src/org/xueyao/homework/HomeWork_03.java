package org.xueyao.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 第三题：分析以下需求，并用代码实现
    实现一个验证码小程序，要求如下：
    1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
    2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在控制台提示验证失败 

 * @author Yao Xue
 * @date Jul 8, 2017 4:37:57 PM
 */
public class HomeWork_03 {
    public static void main(String[] args) throws IOException {
        String path = "data.txt";
      
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
        
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入第"+(i+1)+"个字符串");
            String verification = sc.nextLine();
            bufferedWriter.write(verification);
            bufferedWriter.newLine();
        }
        System.out.println("保存验证码成功");
        bufferedWriter.close();
        
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        System.out.println("请输入您要校验的验证码");
        String string = sc.nextLine();
        String line;
        boolean flag = false;
        while ((line=bufferedReader.readLine())!= null) {
            if (line.equals(string)) {
                flag = true;
            }
        }
        if (flag) {
            System.out.println("查询到该验证码");
        } else {
            System.out.println("验证码不存在");
        }
        bufferedReader.close();
    }
}
