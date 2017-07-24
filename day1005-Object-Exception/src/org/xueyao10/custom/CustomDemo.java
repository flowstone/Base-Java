package org.xueyao10.custom;
/**
 * ##三.自定义异常
    1. JDK不能把所有的异常全部定义出来,当程序员需要一些特殊的异常时，需要自定义
    2. 案例：定义一个Person，当age属性非法时，抛出自定义的NoAgeException
        1. 自定义异常: 入伙  继承 Exception或者继承RuntimeException
 * @author Yao Xue
 * @date Jul 24, 2017 3:47:27 PM
 */
public class CustomDemo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(-18);
        //System.out.println("哈哈");
    }
}


class NoAgeException  extends RuntimeException {

    public NoAgeException(String message) {
        super(message);
    }
    
}

class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <0 || age > 200) {
//            throw new NoAgeException("年龄不合法");
            throw new NoAgeException("年龄不合法age="+age);
        }
        this.age = age;
    }
    
    
}