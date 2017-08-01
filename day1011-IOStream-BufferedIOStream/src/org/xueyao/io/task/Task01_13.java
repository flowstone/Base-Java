package org.xueyao.io.task;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * 从控制台循环接收用户录入的学生信息，输入格式为：学号-学生名字
将学生信息保存到C盘下面的stu.txt文件中，一个学生信息占据一行数据。
当用户输入end时停止输入。
* 要求使用字节输出流写出数据

 * @author Yao Xue
 * @date Aug 1, 2017 10:51:27 PM
 */
public class Task01_13 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("D:\\Temp\\Temp\\test1\\stu.txt");
        Scanner sc = new Scanner(System.in);
        while (true) {
           
            System.out.println("学生的学号");
            String id = sc.nextLine();
            if ("end".equals(id)) {
                break;
            }
            System.out.println("学生的名字");
            String name = sc.nextLine();
            if ("end".equals(name)) {
                break;
            }
            fos.write((id+"-"+name).getBytes());
        }
        fos.close();
    }
}
