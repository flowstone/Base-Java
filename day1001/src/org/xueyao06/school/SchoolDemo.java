package org.xueyao06.school;
/**
 * @author Yao Xue
 * @date Jul 19, 2017 11:59:00 AM
 */
public class SchoolDemo {
    public static void main(String[] args) {
        SchoolMaster schoolMaster = new SchoolMaster();
        schoolMaster.name = "翠花";
        schoolMaster.age = 50;
        schoolMaster.gender = '妖';
        schoolMaster.years = 30;
        
        schoolMaster.introduce();
        
        Student s = new Student();
        s.name = "张三";
        s.age = 18;
        s.gender = '女';
        s.num = 9527;
        s.introduce();
    }
}


class Person {
    String name;
    int age;
    char gender;
    public void introduce() {
        System.out.println("我叫"+name+",年纪"+age+"岁,性别："+gender);
    }
}

class SchoolMaster extends Person {
    int years; //工作年限
}

class Student extends Person {
    int num; //学号
}

class Teacher extends Person {
    String field; //教学领域
}