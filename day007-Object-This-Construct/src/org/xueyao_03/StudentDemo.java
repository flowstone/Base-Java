package org.xueyao_03;
/**
 * 学生类的测试类
 * @author Yao Xue
 * @date Jul 3, 2017 1:46:10 PM
 */
public class StudentDemo {
    public static void main(String[] args) {
        //如何调用构造方法呢？
        //通过new关键字调用
        //格式：类名  对象名 = new 构造方法(...);
        Student s = new Student();
        s.show();
        
        Student s2 = new Student("林青霞");
        s2.show();
        
        Student s3 = new Student(28);
        s3.show();
        
        Student  s4 = new Student("林青霞",28);
        s4.show();
    }
}
