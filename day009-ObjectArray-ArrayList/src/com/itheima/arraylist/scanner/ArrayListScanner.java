package com.itheima.arraylist.scanner;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Yao Xue
 * @date Jul 7, 2017 3:12:44 PM
 */
public class ArrayListScanner {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        setMessage(arrayList);
        setMessage(arrayList);
        
        for (int i = 0; i < arrayList.size(); i++) {
            Student student = arrayList.get(i);
            System.out.println(student.getName()+"----"+student.getAge());
        }
    }
    
    public static void setMessage(ArrayList<Student> arrayList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = sc.nextLine();
        System.out.println("请输入年龄");
        String  age = sc.nextLine();
        Student s = new Student();
        s.setName(name);
        s.setAge(age);
        
        arrayList.add(s);
    }
}
