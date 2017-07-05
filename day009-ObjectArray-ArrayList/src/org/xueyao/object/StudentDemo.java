package org.xueyao.object;
/**
 * 创建一个学生数组，存储三个学生对象并遍历
 * 
 * 分析：
 *      A：定义学生类
 *      B：创建学生数组
 *      C:创建学生对象
 *      D：把学生对象作为元素赋值给学生数组 
 *      E：遍历学生数组
 * @author Yao Xue
 * @date Jul 5, 2017 10:42:57 PM
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建学生数组 
        Student[] students = new Student[3];
        
        //创建学生对象
        Student s1 = new Student("小明", 20);
        Student s2 = new Student("小红", 22);
        Student s3 = new Student("小丽", 23);
        
        //把学生对象作为元素赋值给学生数组
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        
        //遍历学生数组 
        for (int i = 0; i < students.length; i++) {
            Student student = students[i];
//            System.out.println(student);
            System.out.println(student.getName()+"---"+student.getAge());
        }
    }
}
