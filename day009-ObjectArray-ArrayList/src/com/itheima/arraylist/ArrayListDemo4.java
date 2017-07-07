package com.itheima.arraylist;

import java.util.ArrayList;

/**
 * 自定义一个学生类,学生中有姓名和年龄属性,生成满参构造与空参构造生成属性对应的getter/setter方法
        在测试类中使用满参构造创建三个学生对象,然后将每个学生对象均添加到ArrayList集合中
        遍历这个ArrayList集合,依次打印出每个学生的姓名和年龄
 * @author Yao Xue
 * @date Jul 7, 2017 2:46:44 PM
 */
public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<Student>();
        Student student = new Student("丽丽",24,"女");
        Student student1 = new Student("小花",18,"女");
        Student student2 = new Student("小华",24,"男");
        
        arrayList.add(student);
        arrayList.add(student1);
        arrayList.add(student2);
        
        //遍历集合
        for (int i = 0; i < arrayList.size(); i++) {
            Student s = arrayList.get(i);
            System.out.println(s.getName()+"----"+s.getAge()+"----"+s.getSex());
        }
    }
}

