package org.xueyao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 键盘录入3个学生信息(学号,姓名,年龄,居住地)存入集合。然后遍历集合把每一个学生信息存入文本文件
 * (每一个学生信息为一行数据，自己定义分割标记)
 * 
 * 分析：
 *      定义学生类
 *      创建集合对象
 *      写方法实现键盘录入学生信息，并把学生对象作为元素添加到集合
 *      创建输出缓冲流对象
 *      遍历集合，得到第一个学生信息，并把学生信息按照一定的格式写入文本文件
 *              举例：studentid001,老李，30，上海
 * @author Yao Xue
 * @date Jul 9, 2017 2:30:16 PM
 */
public class ArrayListToFileTest {
    public static void main(String[] args) throws IOException {
        //创建集合对象
        ArrayList<Student> arrayList = new ArrayList<Student>();
        
        //写方法实现键盘录入学生信息，并把学生对象作为元素添加到集合
        addStudent(arrayList);
        addStudent(arrayList);
        addStudent(arrayList);
        
        //创建输出缓冲流对象
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("array.txt",true));
        //遍历集合，得到第一个学生信息，并把学生信息按照一定的格式写入文本文件
        
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            //bufferedWriter.write(s.getId()+","+s.getName()+","+s.getAge()+","+s.getAddress());
            //bufferedWriter.newLine();
            StringBuilder sb = new StringBuilder();
            sb.append(s.getId()).append(",").append(s.getName()).append(",").append(s.getAge()).append(",").append(s.getAddress());
            bufferedWriter.write(sb.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }

    private static void addStudent(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in); 
        String id;
        while (true) {
            System.out.println("请输入学生的学号");
            id = sc.nextLine();
            boolean flag = false;
            for (int i = 0; i < arrayList.size(); i++) {
                if (id.equals(arrayList.get(i).getId())) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("对不起，你输入的学生的学号重复，请重新输入");
            } else {
                break;
            }
        }
        
        System.out.println("请输入学生的姓名");
        String name = sc.nextLine();
        System.out.println("请输入学生的年龄");
        String age = sc.nextLine();
        System.out.println("请输入学生的居住地");
        String address = sc.nextLine();
        
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        
        arrayList.add(student);
        System.out.println("添加学生信息成功");
    }
}
