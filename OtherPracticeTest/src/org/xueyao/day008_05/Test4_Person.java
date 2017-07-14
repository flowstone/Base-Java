package org.xueyao.day008_05;
/**
 * @author Yao Xue
 * @date Jul 14, 2017 7:38:40 PM
 */
public class Test4_Person {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("����");
        s1.setAge(18);
        System.out.println(s1.getName()+"..."+s1.getAge());
        s1.eat();
        s1.study();
        
        System.out.println("----------------------");
        Student s2 = new Student();
        s2.setName("����");
        s2.setAge(24);
        System.out.println(s2.getName()+"..."+s2.getAge());
        s2.eat();
        s2.study();
    }
}

/*ʹ�ü̳к��ѧ������ʦ����*/

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
        System.out.println(name+"�Է�");
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
        //System.out.println(this.getName()+"ѧϰ");
        //System.out.println(super.getName()+"ѧϰ");
        System.out.println(getName()+"ѧϰ");
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
        System.out.println("��ʦ����");
    }
    
}
