package com.itheima.object;
/**
 * @author Yao Xue
 * @date Jul 7, 2017 9:47:05 AM
 */
public class StudentArray {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        
       students[0] = new Student("����", 26);
       students[1] = new Student("����", 27);
       students[2] = new Student("������", 36);
       
       for (int i = 0; i < students.length; i++) {
           System.out.println(students[i].getName()+"---"+students[i].getAge());
       }
    }
}
