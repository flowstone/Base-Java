package com.itheima;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Yao Xue
 * @date Jul 10, 2017 9:55:54 AM
 */
public class FileToArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("student_list.txt"));
        ArrayList<Student> arrayList = new ArrayList<Student>();
        
       
        String line;
        while ((line = bufferedReader.readLine())!=null) {
            String[] string = line.split(",");
            Student student = new Student();
            student.setId(string[0]);
            student.setName(string[1]);
            student.setAge(string[2]);
            student.setAddress(string[3]);
            
            arrayList.add(student);
        }
        bufferedReader.close();
        System.out.println("学号\t\t姓名\t年龄\t居住地");
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.println(student.getId()+"\t"+student.getName()+"\t"+student.getAge()+"\t"+student.getAddress());
            
        }
    }
}
