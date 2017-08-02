package me.xueyao.work;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.xueyao.io.task.Student;

/**
 * 使用高效流字符输入读取上一题保存学生信息的文件，每次读取一行信息。
每读取到一行信息就创建一个学生对象并添加到集合中。
遍历集合打印学生信息到控制台。

 * @author Yao Xue
 * @date Aug 2, 2017 9:25:25 AM
 */
public class Test02_02 {
    public static void main(String[] args) throws IOException {
        
            //创建高效流字符流对象
            BufferedReader br = new BufferedReader(new FileReader("D:\\Temp\\Temp\\test1\\stu.txt"));
            //定义集合存放 学生对象
            List<Student> stus = new ArrayList<Student>();
            //定义字符串接收读取的数据
            String line = null;
            while ((line = br.readLine())!= null) {
                //使用-分隔字符串
                String[] str = line.split("-");
                //创建学生对象
                Student stu = new Student(str[0], str[1]);
                //将学生添加到集合中
                stus.add(stu);
            }
            //释放资源
            br.close();
            //遍历集合打印学生信息
            for (Student s : stus) {
                System.out.println(s.getId()+"="+s.getName());
            }
      
    }
}
