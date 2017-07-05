package org.xueyao.arraylist1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 创建一个集合，存储学生对象，学生对象的数据来自键盘录入，最后，遍历集合
 * @author Yao Xue
 * @date Jul 6, 2017 12:13:32 AM
 */
public class ArrayListScanner {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        
        addStudent(array);
        addStudent(array);
        addStudent(array);
        for (int i = 0; i < array.size(); i++) {
            Student student = array.get(i);
            System.out.println(student.getName()+"---"+student.getAge());
        }
    }

    private static void addStudent(ArrayList<Student> array) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入学生姓名：");
        String name = scanner.nextLine();
        System.out.println("请输入学生年龄：");
        String age = scanner.nextLine();
        
        Student student= new Student();
        student.setAge(age);
        student.setName(name);
        
        array.add(student);
    }
}
