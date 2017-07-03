package org.xueyao_04;
/**
 * 学生类的测试类
 * @author Yao Xue
 * @date Jul 3, 2017 3:09:48 PM
 */
public class StudentDemo {
    public static void main(String[] args) {
        
        //无参+setXxx
        Student s = new Student();
        s.setAge(28);
        s.setName("林青霞");
        System.out.println(s.getName()+"-----"+s.getAge());
        
        //带参构造方法
        Student s1 = new Student("林青霞",28);
        System.out.println(s1.getName()+"-----"+s1.getAge());
        
    }
}
