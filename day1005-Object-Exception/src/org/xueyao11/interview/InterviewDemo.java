package org.xueyao11.interview;

import java.io.IOException;

/**
 * 1. 子类重写父类方法的异常问题
        1. 如果父类的方法抛出了异常，子类重写后,可以不抛出异常,也可以抛出异常。但是,子类抛出的异常不能大于父类抛出的异常
        2. 如果父类方法没有抛出异常，子类重写后,方法也不能抛出异常(可以抛出RuntimeException,不被编译器发现)。
        3. 考点：多态
 * @author Yao Xue
 * @date Jul 24, 2017 3:53:13 PM
 */
public class InterviewDemo {
    public static void main(String[] args) {
        Person p = new Student();
        //多态：编译看左边，运行看右边，子类突然出现异常，吓一跳
        try {
            p.speak();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

class Person {
    void speak() throws Exception {
        
    }
    //--------------
    /*void speak() {
        
    }*/
}

class Student extends Person {
    /*@Override
    void speak() throws Exception {
        // TODO Auto-generated method stub
    }*/
    @Override
    void speak() throws IOException {
        // TODO Auto-generated method stub
    }
    
    /*@Override
    void speak() throws Throwable {
        // TODO Auto-generated method stub
    }*/
    
    /*@Override
    void speak(){
        // TODO Auto-generated method stub
    }*/
    
    //--------------
    /*@Override
    void speak() throws Exception {
        // TODO Auto-generated method stub
    }*/
    
    /*@Override
    void speak() throws RuntimeException{
        // TODO Auto-generated method stub
    }*/
    
}