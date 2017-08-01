package org.xueyao.io.task;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 使用高效流输入读取上一题保存学生信息的文件，每次读取一行信息。
每读取到一行信息就创建一个学生对象并添加到集合中。
遍历集合打印学生信息到控制台。

 * @author Yao Xue
 * @date Aug 1, 2017 11:09:45 PM
 */
public class Task01_14 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\Temp\\Temp\\test1\\stu.txt"));
        byte[] buf = new byte[1024];
        int len = 0;
        ArrayList<Student> list = new ArrayList<Student>();
        while ((len = bis.read(buf))!=-1) {
            String s = new String(buf, 0, len);
            String[] split = s.split("-");
            Student stu = new Student(split[0], split[1]);
            list.add(stu);
        }
        bis.close();
        System.out.println(list);
    }
}
