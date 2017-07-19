package org.xueyao07.privated;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 1:21:41 PM
 */
public class SchoolDemo {
    public static void main(String[] args) {
        SchoolMaster master = new SchoolMaster();
        master.name = "翠花";
        master.age = 50;
        master.gender = '妖';
        master.years = 30;
        
        master.introduce();
    }
}

class Person {
    String name = "父类的翠花";
    int age;
    char gender;
}

class SchoolMaster extends Person {
    String name;
    int years; //工作年限
    public void introduce() {
        //super表示子类对象堆内存中的父类区域
        System.out.println("我叫"+super.name+",年纪"+age+"岁，性别："+gender);
    }
}

class Student extends Person {
    int num; //学号
}

class Teacher extends Person {
    String field; //教学领域
}
