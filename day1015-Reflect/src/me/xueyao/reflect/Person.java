package me.xueyao.reflect;
/**
 * @author Yao Xue
 * @date Aug 6, 2017 4:11:41 PM
 */
public class Person {
    private String name;
    private int age;
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Person(String name, int age) {
        super();
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
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
    
    
}
