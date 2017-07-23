package me.xueyao06.protect;

import me.xueyao05.packaged.Person;

/**
 * 注意：protected(不同包是子类),父类的方法只能在子类内部使用，不能外部对象使用
 * @author Yao Xue
 * @date Jul 23, 2017 10:53:39 AM
 */
public class ProtecteDemo {
    public static void main(String[] args) {
        //new Person();
        Student s = new Student();
        //protected不能被子类 的外部调用
        //s.name = "张三";
        s.speak();
        
        
    }
}

class Student extends Person {
    public Student() {
        
    }
    
    //protected只能在子类的内部调用
    void speak() {
        name = "李四";
        System.out.println(name);
    }
}
