package com.itheima_02;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(18);
        student.setName("С��");
        int age = student.getAge();
        String  name = student.getName();
        
        System.out.println(name);
    }
}
