package com.itheima.chenjiewen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 *   程序运行时：控制台提示用户输入注册的用户名和密码；
       验证键盘录入的用户名跟user.txt中已注册的用户名是否重复：
       是：控制台提示：用户名已存在
       否：将键盘录入的用户名及密码写入user.txt文件，并在控制台提示：注册成功；
 */
public class UserDemo {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader("user.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt",true));
        String line;
        String name = null;
        while ((line=br.readLine())!=null) {
            System.out.println("请输入注册用户名:");
            name=sc.nextLine();
            //System.out.println(line);
            boolean b=line.startsWith(name);
            System.out.println(b);
            if (b) {
                System.out.println("用户名已存在!");
            } else {
                break;
            }
        }
        System.out.println("请输入注册密码:");
        String psw=sc.nextLine();
        bw.write(name);
        bw.write(',');
        bw.write(psw);
        bw.newLine();
        System.out.println("注册成功!");
        bw.flush();
        br.close();
        bw.close();
        
        
    }
}
