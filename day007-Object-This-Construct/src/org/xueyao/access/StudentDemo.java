package org.xueyao.access;
/**
 * 学生类的测试类
 * @author Yao Xue
 * @date Jul 3, 2017 11:45:48 AM
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建学生对象
        Student s = new Student();
        s.show();
        
        s.name = "林青霞";
       // s.age = 28;
        s.setAge(-28);
        s.show();
    }
}
