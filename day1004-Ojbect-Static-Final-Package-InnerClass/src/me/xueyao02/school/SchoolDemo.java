package me.xueyao02.school;

/**
 * @author Yao Xue
 * @date Jul 22, 2017 3:37:42 PM
 */
public class SchoolDemo {
    public static void main(String[] args) {
        Student s = new Student();
        Student s2 = new Student();
        
        s.schoolName = "希望小学";
        s2.schoolName = "土豪小学";
        Student.schoolName = "小明小学";
        
        System.out.println(s.schoolName);
        System.out.println(s2.schoolName);
    }
}

class Student {
    static String schoolName;
}
