package org.xueyao.homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 第四题：分析以下需求，并用代码实现
    1.项目根目录下建立文件： user.txt，文件中存放用户名和登录密码，格式：用户名，密码,如：aaa,123；
    2. user.txt文件中初始存放的用户信息有如下：
        jack,123
        rose,123
        tom,123
    3.要求完成如下功能：
      程序运行时：控制台提示用户输入注册的用户名和密码；
       验证键盘录入的用户名跟user.txt中已注册的用户名是否重复：
       是：控制台提示：用户名已存在
       否：将键盘录入的用户名及密码写入user.txt文件，并在控制台提示：注册成功；
       
 * @author Yao Xue
 * @date Jul 8, 2017 4:38:25 PM
 */
public class HomeWork_04 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("user.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("user.txt",true));
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入注册的用户名");
        String  name = sc.nextLine();
            
        String line;
        while ((line = bufferedReader.readLine())!=null) {

            String[] info =   line.trim().split(",");
            if (info[0].equals(name)) {
                System.out.println("用户名已存在");
                System.exit(0);
            } 
        }
            
        System.out.println("请输入注册的密码");
        String password = sc.nextLine();
        bufferedWriter.newLine();
        bufferedWriter.write(name+","+password);
        
        bufferedWriter.close();
        bufferedReader.close();
        System.out.println("注册成功");
    }
}
