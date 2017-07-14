package org.xueyao.day008_05;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 7:38:40 PM
 */
public class Test4_Person {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("张三");
        s1.setAge(18);
        System.out.println(s1.getName()+"..."+s1.getAge());
        s1.eat();
        s1.study();
        
        System.out.println("----------------------");
        Student s2 = new Student();
        s2.setName("李四");
        s2.setAge(24);
        System.out.println(s2.getName()+"..."+s2.getAge());
        s2.eat();
        s2.study();
    }
}

/*使用继承后的学生和老师案例*/

class Person {
    private String name;
    private int age;
    public Person() {
        // TODO Auto-generated constructor stub
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    public void eat() {
        System.out.println(name+"吃饭");
    }
    
}

class Student extends Person {

    public Student() {
    }

    public Student(String name, int age) {
        super(name, age);
        // TODO Auto-generated constructor stub
    }
    
    public void study() {
        //System.out.println(this.getName()+"学习");
        //System.out.println(super.getName()+"学习");
        System.out.println(getName()+"学习");
    }
    
}

class Teacher extends Person {

    public Teacher() {
    }

    public Teacher(String name, int age) {
        super(name, age);
        // TODO Auto-generated constructor stub
    }
    
    public void teach() {
        System.out.println("老师讲课");
    }
    
}
