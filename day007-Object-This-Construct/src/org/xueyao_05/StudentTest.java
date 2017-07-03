package org.xueyao_05;
/**
 * 学生测试类
 * 定义一个测试类分别使用三个构造方法
 * @author Yao Xue
 * @date Jul 3, 2017 4:12:06 PM
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student(100);
        System.out.println("姓名："+s.getName()+", 身高："+s.getHeight());
        
        Student s2 = new Student("林青霞");
        System.out.println("姓名："+s2.getName()+", 身高："+s2.getHeight());
        
        Student s1 = new Student("林青霞", 166);
        System.out.println("姓名："+s1.getName()+", 身高："+s1.getHeight());
        
    }
}
