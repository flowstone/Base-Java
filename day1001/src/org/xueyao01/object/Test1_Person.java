package org.xueyao01.object;
/**
 * @author Yao Xue
 * @date Jul 18, 2017 7:18:48 PM
 */
public class Test1_Person {
    public static void main(String[] args) {
        Person p = new Person();
        p.setAge(18);
        p.setName("����ϼ");
        p.eat();
        p.say();
        
        Person p1 = new Person("����",28);
        p1.say();
        p1.setAge(18);
        p1.say();
    }
}

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
        System.out.println("�Է�");
    }
    
    public void say() {
        System.out.println("�ҽ�"+name+",����"+age+"��");
    }
}
