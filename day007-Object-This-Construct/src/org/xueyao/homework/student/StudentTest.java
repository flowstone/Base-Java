package org.xueyao.homework.student;
/**
 * @author Yao Xue
 * @date Jul 4, 2017 8:09:37 AM
 */
public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("С��");
        student.setAge(18);
        student.setScore(88);
        student.eat();
        student.study();
        
        Student student2 = new Student("С��", 18, 88);
        student2.eat();
        student2.study();
    }
}
