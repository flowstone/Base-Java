package com.itheima;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 10, 2017 9:24:25 AM
 */
public class ArrayListToFile {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        addStudent(arrayList);
        addStudent(arrayList);
        addStudent(arrayList);
        
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("student_list.txt",true));
        
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(student.getId());
            stringBuilder.append(",");
            stringBuilder.append(student.getName());
            stringBuilder.append(",");
            stringBuilder.append(student.getAge());
            stringBuilder.append(",");
            stringBuilder.append(student.getAddress());
            
            bufferedWriter.write(stringBuilder.toString());
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
    }
    
  //添加学生
    private static void addStudent(ArrayList<Student> array) {
        Scanner sc = new Scanner(System.in);
        String id;
        while (true) {
            System.out.println("请输入学生学号：");
            id = sc.nextLine().trim();
            
            Boolean flag = false;
            for (int i = 0; i < array.size(); i++) {
                Student s = array.get(i);
                if (id.equals(s.getId())) {  //说明学号被占用
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("你输入的学号已经被占用，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine().trim();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine().trim();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine().trim();
        
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setAge(age);
        student.setAddress(address);
        
        array.add(student);
        
        System.out.println("添加学生成功");
        
    }
}
