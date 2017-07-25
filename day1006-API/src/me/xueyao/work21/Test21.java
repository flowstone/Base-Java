package me.xueyao.work21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 请使用实现:
已知项目的根目录下有一个student.txt,内容如下:
             1       郝婷婷    女      30
             2       赵鹏      男      35
             3       周强      男      38
             4       李艳欣    女      37
             5       朱可可    女      41
             6       张少荣    女      30
             7       王小军    男      28
该文件中,每一行表示一个学生信息,从前往后依次是学号,姓名,姓名,年龄
要求: 
1. 读取文件内容,把每一个学生信息封装为一个学生对象,存储到ArrayList集合中
2. 打印集合中的学生信息
3. 计算平均年龄
4. 异常处理使用throws的方式


 * @author Yao Xue
 * @date Jul 25, 2017 9:49:49 PM
 */
public class Test21 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        BufferedReader br = null;
        ArrayList<Student> arrayList = new ArrayList<Student>();
        int age = 0;
        int sum =0;
        int count = 0;
        try {
            br = new BufferedReader(new FileReader("student.txt"));
            String line = null;
            
            while ((line = br.readLine())!=null) {
                String content = line.trim();
                String[] split = content.split("\\s+");
                count ++;
                sum += Integer.parseInt(split[3]);
                Student student = new Student(split[0], split[1], split[2], split[3]);
                arrayList.add(student);
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        
        age = sum / count;
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.println(student.getId()+student.getName()+student.getGender()+student.getAge());
        }
        System.out.println("平均年龄"+age);
    }
}
