package org.xueyao_01;
/**
 * 学生类的测试类
 * @author Yao Xue
 * @date Jul 3, 2017 1:46:10 PM
 */
public class StudentDemo {
    public static void main(String[] args) {
        
        Student s = new Student();
        System.out.println(s.getName()+"----------"+s.getAge());
       
        s.setName("林青霞");
        s.setAge(28);
        System.out.println(s.getName()+"----------"+s.getAge());
    }
}
