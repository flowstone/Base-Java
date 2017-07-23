package org.xueyao02.staticd;
/**
 * @author Yao Xue
 * @date Jul 22, 2017 10:35:05 AM
 */
public class Demo02 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        
        Student.schoolName = "小明来学习";
        System.out.println("stu1.schoolName="+stu1.schoolName);
        System.out.println("stu2.schoolName="+stu2.schoolName);
    }
}

class Student {
    public static String schoolName;
}
